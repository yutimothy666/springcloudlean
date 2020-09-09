package com.timothy.common.bean;

import lombok.*;

import java.util.StringJoiner;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:20
 * @Version 1.0
 */
public class OrderTable {
    private Long orderId;
    private String orderCode;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

//    @Override
//    public String toString() {
//        return new StringJoiner(", ", OrderTable.class.getSimpleName() + "[", "]")
//                .add("orderId=" + orderId)
//                .add("orderCode='" + orderCode + "'")
//                .toString();
//    }
}
