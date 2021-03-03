package com.hejx.guli.service.sms.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname SmsProperties
 * @Description TODO
 * @Date 16:21 2021/3/2
 * @Created by hejx
 */

@Data
@Component
//注意prefix要写到最后一个 "." 符号之前
@ConfigurationProperties(prefix="aliyun.sms")
public class SmsProperties {
    private String regionId;
    private String keyId;
    private String keySecret;
    private String templateCode;
    private String signName;
}
