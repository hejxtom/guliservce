package com.hejx.guli.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname TeacherQueryVo
 * @Description TODO
 * @Date 2020/10/25 14:49
 * @Created by hejx
 */
@Data
public class TeacherQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer level;
    private String joinDateBegin;
    private String joinDateEnd;
}
