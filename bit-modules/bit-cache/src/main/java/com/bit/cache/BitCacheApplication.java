package com.bit.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebSecurity
@EnableCaching
@EnableWebMvc
@EnableDiscoveryClient
@Slf4j
public class BitCacheApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BitCacheApplication.class, args);
        log.info("({}◠‿◠)ﾉﾞ  {} 启动成功   ლ(´ڡ`ლ)ﾞ", AnsiOutput.toString(AnsiColor.RED, "♥"), run.getId());
    }
}