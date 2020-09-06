package com.timothy.orderservice.service;

import com.timothy.common.bean.OrderTable;

import java.util.List;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:33
 * @Version 1.0
 */
public interface OrderService {
    public OrderTable selectOrderTableById(Long orderId);

    public List<OrderTable> selectOrderTableList(OrderTable orderTable);

    public int insertOrderTable(OrderTable orderTable);

    public int updateOrderTable(OrderTable orderTable);

    public int deleteOrderTableByIds(String ids);

    public int deleteOrderTableById(Long orderId);
}
