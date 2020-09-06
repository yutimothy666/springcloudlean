package com.timothy.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yutimothy
 * @Date 2020/9/3 21:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer80.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
