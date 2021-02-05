package com.hejx.guli.service.edu.controller.test;

import com.hejx.guli.common.base.result.R;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname loginController
 * @Description TODO
 * @Date 16:08 2021/1/27
 * @Created by hejx
 */

@CrossOrigin //跨域
@RestController
@RequestMapping("/user")
public class loginController {

    /**
     * 登录
     * @return
     */
    @PostMapping("login")
    public R login() {
        return R.ok().data("token","admin");
    }

    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("info")
    public R info() {
        return R.ok()
                .data("roles","[admin]")  //权限
                .data("name","admin")     //姓名
                .data("avatar","https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/touxiang/1.jpg"); //头像
    }

    /**
     * 退出
     * @return
     */
    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }
}
