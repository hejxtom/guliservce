package com.hejx.guli.service.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceSmsApplication
 * @Description TODO
 * @Date 16:21 2021/3/2
 * @Created by hejx
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan({"com.hejx.guli"})
@EnableDiscoveryClient
public class ServiceSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}
