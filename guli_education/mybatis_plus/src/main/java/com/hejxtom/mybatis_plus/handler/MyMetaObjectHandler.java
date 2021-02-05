package com.hejxtom.mybatis_plus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *  实现元对象处理器接口
 * @Classname MyMetaObjectHandler
 * @Description TODO
 * @Date 2020/9/19 16:49
 * @Created by hejx
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("insertFill 。。。。。。");
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("updateFill 。。。。。。");
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
