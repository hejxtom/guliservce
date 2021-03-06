package com.hejx.guli.service.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * @Classname HttpSessionConfig
 * @Description TODO
 * @Date 18:01 2021/3/5
 * @Created by hejx
 */

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    //可选配置
    @Bean
    public CookieSerializer cookieSerializer() {
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        //我们可以将Spring Session默认的Cookie Key从SESSION替换为原生的JSESSIONID(更改名字)
        serializer.setCookieName("JSESSIONID");
        // CookiePath设置为根路径
        serializer.setCookiePath("/");
        // 配置了相关的正则表达式，可以达到同父域下的单点登录的效果
        serializer.setDomainNamePattern("^.+?\\.(\\w+\\.[a-z]+)$");
        return serializer;
    }
}
