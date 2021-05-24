package com.windsun.springcloud;

/**
 * 项目名称：springcloud-leaning
 * 类 名 称：EurekaSecurityServerApplication
 * 类 描 述：
 * 创建时间：2021/5/24 22:54
 * 创 建 人：wangsheng
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/12/18 10:49
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityServerApplication.class, args);
    }

}
