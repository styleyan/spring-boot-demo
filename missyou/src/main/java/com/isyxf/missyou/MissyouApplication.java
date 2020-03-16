package com.isyxf.missyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 热重启配置方式
 *
 * 1. 在pom 文件中添加 spring-boot-devtools 架包，并把 runtime 设置为 true
 * 2. settings -> compiler -> Build project automatically 给勾好
 * 3. 重启服务就可以了
 */
@SpringBootApplication
public class MissyouApplication {
    public static void main(String[] args) {
        SpringApplication.run(MissyouApplication.class, args);
    }
}
