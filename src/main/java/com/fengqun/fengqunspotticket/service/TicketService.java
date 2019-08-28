package com.fengqun.fengqunspotticket.service;

import com.fengqun.fengqunspotticket.entity.Ticket;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:28
 */
public interface TicketService {
    void addTicket(Ticket ticket);
    void  deleteById(long id);
    void updateTicket(Ticket ticket);

    //查询详情和修改前回显数据
    Ticket findById(long id);

    //查询全部
    List<Ticket> findALLTicket();
}
