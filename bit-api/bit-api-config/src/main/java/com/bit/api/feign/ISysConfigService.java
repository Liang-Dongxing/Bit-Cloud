package com.bit.api.feign;

import com.bit.common.core.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(contextId = "ISysConfigService", value = ServiceNameConstants.CONFIG_SERVICE, fallback = ISysConfigServiceFallback.class)
public interface ISysConfigService {

    /**
     * 获取验证码开关
     *
     * @return true开启，false关闭
     */
    @GetMapping("/system/config/captchaEnabled")
    public Boolean selectCaptchaEnabled();

}
