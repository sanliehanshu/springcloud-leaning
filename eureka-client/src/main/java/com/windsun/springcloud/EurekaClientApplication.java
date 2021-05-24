package com.windsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 项目名称：springcloud-leaning
 * 类 名 称：EurekaClientApplication
 * 类 描 述：
 * 创建时间：2021/5/24 21:16
 * 创 建 人：wangsheng
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
