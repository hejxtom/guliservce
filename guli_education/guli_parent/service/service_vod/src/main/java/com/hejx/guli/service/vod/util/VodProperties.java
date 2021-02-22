package com.hejx.guli.service.vod.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname VodProperties
 * @Description TODO
 * @Date 15:40 2021/2/21
 * @Created by hejx
 */

@Data
@Component  //容器内自动初始化
@ConfigurationProperties(prefix="aliyun.vod")   //获取配置文件信息，装载
public class VodProperties {
    private String keyid;
    private String keysecret;
    private String templateGroupId;
    private String workflowId;
}
