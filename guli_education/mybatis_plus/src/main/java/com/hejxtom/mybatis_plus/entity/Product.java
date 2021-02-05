package com.hejxtom.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @Classname Product
 * @Description TODO
 * @Date 2020/9/19 17:32
 * @Created by hejx
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
}
