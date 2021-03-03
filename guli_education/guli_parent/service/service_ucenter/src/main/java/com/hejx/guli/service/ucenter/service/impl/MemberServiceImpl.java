package com.hejx.guli.service.ucenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hejx.guli.common.base.result.ResultCodeEnum;
import com.hejx.guli.common.base.util.FormUtils;
import com.hejx.guli.common.base.util.MD5;
import com.hejx.guli.service.base.exception.GuliException;
import com.hejx.guli.service.ucenter.entity.Member;
import com.hejx.guli.service.ucenter.entity.vo.RegisterVo;
import com.hejx.guli.service.ucenter.mapper.MemberMapper;
import com.hejx.guli.service.ucenter.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author hejx
 * @since 2021-03-02
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 会员注册
     * @param registerVo
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void register(RegisterVo registerVo) {

        String nickname = registerVo.getNickname();
        String mobile = registerVo.getMobile();
        String password = registerVo.getPassword();
        String code = registerVo.getCode();

        //校验参数
        if (StringUtils.isEmpty(mobile)
                || !FormUtils.isMobile(mobile)
                || StringUtils.isEmpty(password)
                || StringUtils.isEmpty(code)
                || StringUtils.isEmpty(nickname)) {
            throw new GuliException(ResultCodeEnum.PARAM_ERROR);
        }

        //校验验证码
        String checkCode = (String)redisTemplate.opsForValue().get(mobile);
        if(!code.equals(checkCode)){
            throw new GuliException(ResultCodeEnum.CODE_ERROR);
        }

        //是否被注册
        QueryWrapper<Member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("mobile", mobile);
        Integer count = baseMapper.selectCount(queryWrapper);
        if(count > 0){
            throw new GuliException(ResultCodeEnum.REGISTER_MOBLE_ERROR);
        }

        //注册
        Member member = new Member();
        member.setNickname(nickname);
        member.setMobile(mobile);
        member.setPassword(MD5.encrypt(password));
        member.setDisabled(false);
        member.setAvatar("https://guli-file-helen.oss-cn-beijing.aliyuncs.com/avatar/default.jpg");
        baseMapper.insert(member);
    }
}
