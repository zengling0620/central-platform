package com.it.basic;

import com.it.common.core.Pretty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZL
 * @menu todo
 * @date 2021/9/3 11:22
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class GatewayServer {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(GatewayServer.class, args));
        log.info("网关服务启动成功耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }

}
