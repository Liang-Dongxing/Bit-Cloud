package com.bit.common.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 *
 * @author bit
 */
@Component
@ConfigurationProperties(prefix = "bit")
@Data
public class BitConfig {
    /**
     * 上传路径
     */
    private String profile;
    /**
     * 获取地址开关
     */
    private Boolean addressEnabled;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 版本
     */
    private String version;
    /**
     * 版权年份
     */
    private String copyrightYear;
    /**
     * 实例演示开关
     */
    private Boolean demoEnabled;

    /**
     * 获取导入上传路径
     */
    public String getImportPath() {
        return getProfile() + "/import";
    }

    /**
     * 获取头像上传路径
     */
    public String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public String getDownloadPath() {
        return getProfile() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public String getUploadPath() {
        return getProfile() + "/upload";
    }

}
