package com.htc.generator.mapper;

import com.htc.generator.pojo.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(String oid);

    int insert(Orders record);

    Orders selectByPrimaryKey(String oid);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}