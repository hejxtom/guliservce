package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.atguigu.easyexcel.entity.ExcelStudentData;
import com.atguigu.easyexcel.listener.ExcelStudentDataListener;
import org.junit.Test;

/**
 * @Classname ExcelReadTest
 * @Description TODO
 * @Date 15:41 2021/2/2
 * @Created by hejx
 */

public class ExcelReadTest {

    /**
     * 最简单的读
     */
    @Test
    public void simpleRead07() {

        String fileName = "d:/excel/01-simpleWrite-07.xlsx";
        // 这里默认读取第一个sheet
        EasyExcel.read(fileName, ExcelStudentData.class, new ExcelStudentDataListener()).sheet().doRead();
    }

    @Test
    public void simpleRead03() {

        String fileName = "d:/excel/01-simpleWrite-03.xls";
        // 这里默认读取第一个sheet
        EasyExcel.read(fileName, ExcelStudentData.class, new ExcelStudentDataListener()).excelType(ExcelTypeEnum.XLS).sheet().doRead();
    }
}
