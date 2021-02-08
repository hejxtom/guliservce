package com.hejx.guli.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname CourseQueryVo
 * @Description TODO
 * @Date 16:31 2021/2/7
 * @Created by hejx
 */

@Data
public class CourseQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String teacherId;
    private String subjectParentId;
    private String subjectId;
}
