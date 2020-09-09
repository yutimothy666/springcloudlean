package com.timothy.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.stream.IntStream;

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
        IntStream.range(1, 3).forEach(System.out::println);
    }
}
