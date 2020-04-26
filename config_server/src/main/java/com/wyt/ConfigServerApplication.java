package com.wyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/***
 * config服务注解
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    /***
     * main主函数启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
