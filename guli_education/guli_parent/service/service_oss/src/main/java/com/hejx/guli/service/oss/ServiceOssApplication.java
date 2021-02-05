package com.hejx.guli.service.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceOssApplication
 * @Description TODO
 * @Date 15:29 2021/1/30
 * @Created by hejx
 */

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
//(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
@ComponentScan({"com.hejx.guli"})
@EnableDiscoveryClient
public class ServiceOssApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOssApplication.class, args);
    }

}
