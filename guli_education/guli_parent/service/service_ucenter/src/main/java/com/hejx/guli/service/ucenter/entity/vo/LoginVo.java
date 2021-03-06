package com.hejx.guli.service.ucenter.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname LoginVo
 * @Description TODO
 * @Date 8:09 2021/3/4
 * @Created by hejx
 */

@Data
public class LoginVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String mobile;
    private String password;
}
