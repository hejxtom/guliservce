package com.hejx.guli.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname WebCourseQueryVo
 * @Description TODO
 * @Date 15:31 2021/2/23
 * @Created by hejx
 */

@Data
public class WebCourseQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String subjectParentId;
    private String subjectId;
    private String buyCountSort;
    private String gmtCreateSort;
    private String priceSort;
    private Integer type; //价格正序：1，价格倒序：2
}