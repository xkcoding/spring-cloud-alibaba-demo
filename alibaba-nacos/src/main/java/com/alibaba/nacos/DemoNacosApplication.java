package com.alibaba.nacos;

import com.alibaba.nacos.console.config.ConfigConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * nacos启动类
 * </p>
 *
 * @package: com.alibaba.nacos
 * @description: nacos启动类
 * @author: yangkai.shen
 * @date: Created in 2019-07-11 14:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@ServletComponentScan
@EnableScheduling
public class DemoNacosApplication {
    public static void main(String[] args) {
        System.setProperty(ConfigConstants.TOMCAT_DIR, "logs");
        System.setProperty(ConfigConstants.TOMCAT_ACCESS_LOG, "false");
        System.setProperty(ConfigConstants.STANDALONE_MODE, "true");
        SpringApplication.run(DemoNacosApplication.class, args);
    }
}
