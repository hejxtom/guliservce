package com.hejx.guli.service.ucenter.service;

import com.hejx.guli.service.base.dto.MemberDto;
import com.hejx.guli.service.ucenter.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.ucenter.entity.vo.LoginVo;
import com.hejx.guli.service.ucenter.entity.vo.RegisterVo;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author hejx
 * @since 2021-03-02
 */
public interface MemberService extends IService<Member> {

    void register(RegisterVo registerVo);

    String login(LoginVo loginVo);

    Member getByOpenid(String openid);

    MemberDto getMemberDtoByMemberId(String memberId);
}
