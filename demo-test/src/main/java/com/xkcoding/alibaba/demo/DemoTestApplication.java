package com.xkcoding.alibaba.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-07-26 16:12
 */
@RestController
@SpringCloudApplication
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DemoTestApplication {
    private final PropertiesTestConfig propertiesTestConfig;

    public static void main(String[] args) {
        SpringApplication.run(DemoTestApplication.class, args);
    }

    @GetMapping("/test")
    public String propertyTest() {
        return propertiesTestConfig.getKey();
    }
}
