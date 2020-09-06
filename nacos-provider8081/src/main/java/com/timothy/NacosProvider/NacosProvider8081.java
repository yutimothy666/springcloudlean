package com.timothy.NacosProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yutimothy
 * @Date 2020/9/1 19:27
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider8081 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider8081.class);
    }
}
