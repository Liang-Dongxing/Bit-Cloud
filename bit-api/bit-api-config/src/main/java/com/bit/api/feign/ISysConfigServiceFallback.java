package com.bit.api.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ISysConfigServiceFallback implements FallbackFactory<ISysConfigService> {

    @Override
    public ISysConfigService create(Throwable cause) {

        log.error("参数配置服务调用失败: {}", cause.getMessage());
        return new ISysConfigService() {
            @Override
            public Boolean selectCaptchaEnabled() {
                return false;
            }
        };
    }
}
