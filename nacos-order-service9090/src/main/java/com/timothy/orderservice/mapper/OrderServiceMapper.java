package com.timothy.orderservice.mapper;

import com.timothy.common.bean.OrderTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author yutimothy
 * @Date 2020/9/5 21:42
 * @Version 1.0
 */
@Mapper
public interface OrderServiceMapper {
    public OrderTable selectOrderTableById(Long orderId);

    public List<OrderTable> selectOrderTableList(OrderTable orderTable);

    public int insertOrderTable(OrderTable orderTable);

    public int updateOrderTable(OrderTable orderTable);

    public int deleteOrderTableByIds(String[] ids);

    public int deleteOrderTableById(Long orderId);
}
