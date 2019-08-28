package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.entity.Order;
import com.fengqun.fengqunspotticket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 18:11
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private HttpServletRequest request;


    //查询订单详情
    @GetMapping("/order/{id}/order_details")
    public ResponseVo order_details(@RequestParam("id") long id ){
        Order order = orderService.findById(id);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(order);
        return vo;
    }
    //查询全部已支付订单
    @GetMapping("/orders_paid/{memberId}")
    public ResponseVo listOrderPaid(@RequestParam("memberId") long memberId){
//        Member loginUser = (Member)request.getSession().getAttribute("loginUser");
//        Integer memberId = loginUser.getId();
        List<Order> orderPaidList = orderService.findAllPaidOrder(memberId);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(orderPaidList);
        return vo;
    }
    //查询全部未支付订单
    @GetMapping("/orders_unpaid/{memberId}")
    public ResponseVo listOrderUnPaid(@RequestParam("memberId") Integer memberId){
        List<Order> orderUnPaidList = orderService.findAllUnpaidOrder(memberId);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(orderUnPaidList);
        return vo;
    }

}
