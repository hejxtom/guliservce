package com.hejx.guli.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceEduApplication
 * @Description TODO
 * @Date 2020/9/26 15:54
 * @Created by hejx
 */
@SpringBootApplication
@ComponentScan({"com.hejx.guli"})
@EnableDiscoveryClient
@EnableFeignClients //服务调用注解
public class ServiceEduApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEduApplication.class, args);
    }
}
