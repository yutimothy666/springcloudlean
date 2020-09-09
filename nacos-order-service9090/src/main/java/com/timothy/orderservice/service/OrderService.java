package com.timothy.orderservice.service;

import com.timothy.common.bean.OrderTable;

import java.util.List;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:33
 * @Version 1.0
 */
public interface OrderService {
    OrderTable selectOrderTableById(Long orderId);

    List<OrderTable> selectOrderTableList(OrderTable orderTable);

    int insertOrderTable(OrderTable orderTable);

    int updateOrderTable(OrderTable orderTable);

    int deleteOrderTableByIds(String ids);

    int deleteOrderTableById(Long orderId);
}
