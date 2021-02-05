package com.hejxtom.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;


/**
 * @Classname User
 * @Description TODO
 * @Date 2020/9/19 11:38
 * @Created by hejx
 */

@Data //导入lomok，自动编译生成set/get方法
public class User {
    //@TableId(type = IdType.ASSIGN_ID) //雪花算法
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)

    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic //逻辑删除
    private Integer deleted;
}
