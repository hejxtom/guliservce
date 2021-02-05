package com.hejxtom.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hejxtom.mybatis_plus.entity.User;
import com.hejxtom.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 条件查询
 *
 *
 * @Classname WrapperTest
 * @Description TODO
 * @Date 2020/9/20 9:09
 * @Created by hejx
 */
@SpringBootTest
public class WrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQueryWrapper_Delete(){

        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        /**
         * lt 小于
         * le 小于等于
         * eq 等于
         * ne 不等于
         * ge 大于等于
         * gt 大于
         *
         *
         */
        userQueryWrapper.eq("age",18);
        int result=userMapper.delete(userQueryWrapper);
        System.out.println("删除了"+result+"条数据");

    }
}
