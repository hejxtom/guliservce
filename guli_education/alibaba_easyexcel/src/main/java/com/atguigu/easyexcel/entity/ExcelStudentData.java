package com.atguigu.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Classname ExcelStudentData
 * @Description TODO
 * @Date 15:21 2021/2/2
 * @Created by hejx
 */

@Data
public class ExcelStudentData {

    @ExcelProperty(value = "姓名")
    private String name;

    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "生日")
    private Date birthday;

    @NumberFormat("#.##%")//百分比表示，保留两位小数
    @ExcelProperty(value = "薪资")
    private Double salary;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String password;
}
