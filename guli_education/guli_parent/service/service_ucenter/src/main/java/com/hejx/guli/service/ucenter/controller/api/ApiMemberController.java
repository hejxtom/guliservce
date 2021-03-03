package com.hejx.guli.service.ucenter.controller.api;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.ucenter.entity.vo.RegisterVo;
import com.hejx.guli.service.ucenter.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname ApiMemberController
 * @Description TODO
 * @Date 16:53 2021/3/2
 * @Created by hejx
 */
@Api(description = "会员管理")
@CrossOrigin
@RestController
@RequestMapping("/api/ucenter/member")
@Slf4j
public class ApiMemberController {

    @Autowired
    private MemberService memberService;

    @ApiOperation(value = "会员注册")
    @PostMapping("register")
    public R register(@RequestBody RegisterVo registerVo){
        memberService.register(registerVo);
        return R.ok();
    }
}
