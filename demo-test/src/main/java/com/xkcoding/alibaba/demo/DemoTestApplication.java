package com.xkcoding.alibaba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @package: com.xkcoding.alibaba.demo
 * @description: 启动类
 * @author: yangkai.shen
 * @date: Created in 2019-07-11 17:58
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@SpringCloudApplication
public class DemoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoTestApplication.class, args);
    }
}
