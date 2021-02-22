package com.hejx.guli.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname CoursePublishVo
 * @Description TODO
 * @Date 13:23 2021/2/9
 * @Created by hejx
 */

@Data
public class CoursePublishVo  implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private String cover;
    private Integer lessonNum;
    private String subjectParentTitle;
    private String subjectTitle;
    private String teacherName;
    private String price;//只用于显示
}
