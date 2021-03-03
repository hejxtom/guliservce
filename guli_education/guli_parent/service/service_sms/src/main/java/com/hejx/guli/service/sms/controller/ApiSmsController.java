package com.hejx.guli.service.sms.controller;

import com.aliyuncs.exceptions.ClientException;
import com.hejx.guli.common.base.result.R;
import com.hejx.guli.common.base.result.ResultCodeEnum;
import com.hejx.guli.common.base.util.FormUtils;
import com.hejx.guli.common.base.util.RandomUtils;
import com.hejx.guli.service.base.exception.GuliException;
import com.hejx.guli.service.sms.service.SmsService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Classname ApiSmsController
 * @Description TODO
 * @Date 16:27 2021/3/2
 * @Created by hejx
 */

@RestController
@RequestMapping("/api/sms")
@Api(description = "短信管理")
@CrossOrigin //跨域
@Slf4j
public class ApiSmsController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("send/{mobile}")
    public R getCode(@PathVariable String mobile) throws ClientException {

        //校验手机号是否合法
        if(StringUtils.isEmpty(mobile) || !FormUtils.isMobile(mobile)) {
            log.error("请输入正确的手机号码 ");
            throw new GuliException(ResultCodeEnum.LOGIN_PHONE_ERROR);
        }

        //生成验证码
        String checkCode = RandomUtils.getFourBitRandom();
        System.out.println(checkCode);
        //发送验证码
        //到时候测试接入短信服务
        //smsService.send(mobile, checkCode);
        //将验证码存入redis缓存
        redisTemplate.opsForValue().set(mobile, checkCode, 5, TimeUnit.MINUTES);

        return R.ok().message("短信发送成功");
    }
}
