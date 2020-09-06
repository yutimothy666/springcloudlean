package com.timothy.orderservice.mapper;

import com.timothy.common.bean.OrderTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.UUID;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yutimothy
 * @Date 2020/9/5 23:48
 * @Version 1.0
 */
@SpringBootTest
class OrderServiceMapperTest {
    @Autowired
    OrderServiceMapper orderServiceMapper;

    @Test
    void selectOrderTableById() {
    }

    @Test
    void selectOrderTableList() {
        orderServiceMapper.selectOrderTableList(null).forEach(System.out::println);
    }

    @Test
    void insertOrderTable() {
        for (int i = 0; i < 100; i++) {
            OrderTable orderTable = new OrderTable();
            orderTable.setOrderCode(UUID.randomUUID().toString());
            orderServiceMapper.insertOrderTable(orderTable);
            orderTable = null;
        }
    }

    @Test
    void updateOrderTable() {
    }

    @Test
    void deleteOrderTableByIds() {
    }

    @Test
    void deleteOrderTableById() {
    }
}