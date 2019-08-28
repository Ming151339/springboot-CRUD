package com.fengqun.fengqunspotticket.service.Impl;

import com.fengqun.fengqunspotticket.dao.OrderDao;
import com.fengqun.fengqunspotticket.entity.Order;
import com.fengqun.fengqunspotticket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 18:05
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> findAllPaidOrder(long memberId) {
        List<Order> PaidOrderList = orderDao.findAllPaidOrder(memberId);

        return PaidOrderList;
    }

    @Override
    public List<Order> findAllUnpaidOrder(long memberId) {
        List<Order> UnpaidOrderList = orderDao.findAllUnpaidOrder(memberId);
        return UnpaidOrderList;
    }

    @Override
    public Order findById(long id) {
        Order order = orderDao.findById(id);
        return order;
    }
}
