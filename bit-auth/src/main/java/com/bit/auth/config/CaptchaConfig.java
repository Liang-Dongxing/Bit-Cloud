package com.bit.auth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "captcha")
@Data
public class CaptchaConfig {

    /**
     * 验证码类型
     */
    private String type;
    /**
     * 验证码图片格式
     */
    private String imageFormat;
    /**
     * 验证码长
     */
    private Integer width;
    /**
     * 验证码宽
     */
    private Integer height;
}
