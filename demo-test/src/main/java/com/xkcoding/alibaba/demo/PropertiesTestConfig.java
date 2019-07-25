package com.xkcoding.alibaba.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 测试配置获取
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-07-26 15:10
 */
@Data
@Configuration
@RefreshScope
public class PropertiesTestConfig {
    @Value("${key}")
    private String key;
}
