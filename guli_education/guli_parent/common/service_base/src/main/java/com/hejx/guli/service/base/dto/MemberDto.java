package com.hejx.guli.service.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname MemberDto
 * @Description TODO
 * @Date 19:12 2021/3/6
 * @Created by hejx
 */

@Data
public class MemberDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;//会员id
    private String mobile;//手机号
    private String nickname;//昵称
}