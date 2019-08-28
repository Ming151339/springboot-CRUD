package com.fengqun.fengqunspotticket.service;

import com.fengqun.fengqunspotticket.entity.Order;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:27
 */
public interface OrderService {
    //查询全部已支付订单
    List<Order> findAllPaidOrder(long memberId );
    //查询全部未支付订单
    List<Order> findAllUnpaidOrder(long memberId );
    //订单详情
    Order  findById(long id);
}
