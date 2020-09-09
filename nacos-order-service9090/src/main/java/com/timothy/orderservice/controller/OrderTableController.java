package com.timothy.orderservice.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.timothy.common.bean.OrderTable;
import com.timothy.common.config.AjaxResult;
import com.timothy.orderservice.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author yutimothy
 * @Date 2020/9/6 0:07
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "orderTable", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderTableController {

    @Resource
    OrderService orderService;

    @GetMapping()
    public AjaxResult getList(OrderTable orderTable) {
        return AjaxResult.success(orderService.selectOrderTableList(orderTable));
    }

    @GetMapping(value = "/{id}")
    public Object getOne(@PathVariable("id") Long orderId) {
        return AjaxResult.success(orderService.selectOrderTableById(orderId));
    }

    @PostMapping
    public AjaxResult post(@RequestBody OrderTable orderTable) {

        return AjaxResult.toAjax(orderService.insertOrderTable(orderTable));
    }

    @PutMapping
    public AjaxResult update(@RequestBody OrderTable orderTable) {
        return AjaxResult.toAjax(orderService.updateOrderTable(orderTable));
    }

    @DeleteMapping
    public AjaxResult delete(Long orderId) {
        return AjaxResult.toAjax(orderService.deleteOrderTableById(orderId));
    }

}
