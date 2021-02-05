package com.hejx.guli.service.edu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname OpenFeignConfig
 * @Description TODO
 * @Date 16:18 2021/2/1
 * @Created by hejx
 */

@Configuration
public class OpenFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
