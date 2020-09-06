package com.timothy.orderservice.service.impl;

import com.timothy.common.bean.OrderTable;
import com.timothy.orderservice.mapper.OrderServiceMapper;
import com.timothy.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:34
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderServiceMapper orderServiceMapper;

    public OrderTable selectOrderTableById(Long orderId) {
        return orderServiceMapper.selectOrderTableById(orderId);
    }

    public List<OrderTable> selectOrderTableList(OrderTable orderTable) {
        return orderServiceMapper.selectOrderTableList(orderTable);
    }

    public int insertOrderTable(OrderTable orderTable) {
        return orderServiceMapper.insertOrderTable(orderTable);
    }

    public int updateOrderTable(OrderTable orderTable) {
        return orderServiceMapper.updateOrderTable(orderTable);
    }

    public int deleteOrderTableByIds(String ids) {
        return orderServiceMapper.deleteOrderTableByIds(ids.split(","));
    }

    public int deleteOrderTableById(Long orderId) {
        return orderServiceMapper.deleteOrderTableById(orderId);
    }
}
