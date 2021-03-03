package com.hejx.guli.service.ucenter.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname RegisterVo
 * @Description TODO
 * @Date 16:52 2021/3/2
 * @Created by hejx
 */

@Data
public class RegisterVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nickname;
    private String mobile;
    private String password;
    private String code;
}
