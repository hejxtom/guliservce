package com.hejx.guli.service.edu.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hejx.guli.service.base.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 *
 * swagger:
 *  @ApiModel; 生成Model解释文档
 *
 * lombok:
 *   @Accessors: 用来配置lombok如何产生和显示getters和setters的方法。
 *               chain 一个布尔值。如果为真，产生的setter返回的this而不是void。
 *               fluent 一个布尔值。如果为真，pepper的getter就是 pepper()，setter方法就是pepper(T newValue)。并且，除非特别说明，chain默认为真。
 *               prefix 用于生成getter和setter方法的字段名会忽视指定前缀（遵守驼峰命名）:如 pid -->setId()
 *
 */
@Data  //生成get/set方法
@EqualsAndHashCode(callSuper = true)  //生成equals(Object other) 和 hashCode()方法。
@Accessors(chain = true)
@TableName("edu_teacher")  //对应数据库表
@ApiModel(value="Teacher对象", description="讲师")  //swagger生成
public class Teacher extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "讲师姓名")
    private String name;

    @ApiModelProperty(value = "讲师简介")
    private String intro;

    @ApiModelProperty(value = "讲师资历,一句话说明讲师")
    private String career;

    @ApiModelProperty(value = "头衔 1高级讲师 2首席讲师")
    private Integer level;

    @ApiModelProperty(value = "讲师头像")
    private String avatar;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "入驻时间",example = "2019-10-29")
    private Date joinDate;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @TableField("is_deleted")
    @TableLogic //表示逻辑删除
    private Boolean deleted;


}
