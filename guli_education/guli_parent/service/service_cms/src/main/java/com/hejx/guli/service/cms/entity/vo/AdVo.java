package com.hejx.guli.service.cms.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname AdVo
 * @Description TODO
 * @Date 15:34 2021/2/24
 * @Created by hejx
 */

@Data
public class AdVo implements Serializable {

    private static final long serialVersionUID=1L;
    private String id;
    private String title; //广告标题
    private Integer sort; //广告排序
    private String type;  //广告位
}