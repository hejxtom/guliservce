package com.hejx.guli.service.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceCmsApplication
 * @Description TODO
 * @Date 15:22 2021/2/24
 * @Created by hejx
 */

@SpringBootApplication
@ComponentScan({"com.hejx.guli"})
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCmsApplication.class, args);
    }

}
