package com.hejx.guli.service.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceUcenterApplication
 * @Description TODO
 * @Date 16:41 2021/3/2
 * @Created by hejx
 */
@SpringBootApplication
@ComponentScan({"com.hejx.guli"})
@EnableDiscoveryClient
public class ServiceUcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUcenterApplication.class, args);
    }
}
