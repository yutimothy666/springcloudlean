package com.timothy.nacosconsumer.controller;

import com.timothy.common.bean.OrderTable;
import com.timothy.common.config.AjaxResult;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.awt.*;

/**
 * @Author yutimothy
 * @Date 2020/9/9 23:12
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/orderTable", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderTableController {
    @Resource
    RestTemplate restTemplate;

    private final static String ORDER_SERVER_URL = "http://nacos-order-service";


    @GetMapping()
    public AjaxResult get(OrderTable orderTable) {
        return restTemplate.getForObject(ORDER_SERVER_URL, AjaxResult.class, orderTable);
    }
}
