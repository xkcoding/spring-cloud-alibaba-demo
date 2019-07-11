package com.alibaba.nacos.console.config;

/**
 * <p>
 * 覆盖nacos 默认配置
 * </p>
 *
 * @package: com.alibaba.nacos.console.config
 * @description: 覆盖nacos 默认配置
 * @author: yangkai.shen
 * @date: Created in 2019-07-11 14:16
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface ConfigConstants {
    /**
     * The System property name of  Standalone mode
     */
    String STANDALONE_MODE = "nacos.standalone";

    /**
     * tomcat 目录
     */
    String TOMCAT_DIR = "server.tomcat.basedir";

    /**
     * tomcat 日志配置
     */
    String TOMCAT_ACCESS_LOG = "server.tomcat.accesslog.enabled";

}
