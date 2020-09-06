package com.timothy.orderservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderService9090 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService9090.class);
    }
}
