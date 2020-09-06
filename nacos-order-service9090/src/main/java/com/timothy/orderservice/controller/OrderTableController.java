package com.timothy.orderservice.controller;

import com.timothy.common.bean.OrderTable;
import com.timothy.common.config.AjaxResult;
import com.timothy.orderservice.service.OrderService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author yutimothy
 * @Date 2020/9/6 0:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/orderTable")
public class OrderTableController {

    @Resource
    OrderService orderService;

    @GetMapping()
    public AjaxResult getList(@RequestBody OrderTable orderTable) {
        return AjaxResult.success(orderService.selectOrderTableList(orderTable));
    }

    @GetMapping("/{id}")
    @ResponseBody
    public AjaxResult getOne(@PathVariable("id") Long orderId) {
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
