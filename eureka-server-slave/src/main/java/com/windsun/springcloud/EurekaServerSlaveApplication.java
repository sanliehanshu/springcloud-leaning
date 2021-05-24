package com.windsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 项目名称：springcloud-leaning
 * 类 名 称：EurekaServerApplication
 * 类 描 述：
 * 创建时间：2021/5/24 20:42
 * 创 建 人：wangsheng
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSlaveApplication.class, args);
    }

}
