package com.hejx.guli.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname VideoVo
 * @Description TODO
 * @Date 9:10 2021/2/15
 * @Created by hejx
 */

@Data
public class VideoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private Boolean free;
    private Integer sort;

    private String videoSourceId;
}
