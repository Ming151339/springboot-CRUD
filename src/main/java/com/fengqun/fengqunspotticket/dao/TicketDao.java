package com.fengqun.fengqunspotticket.dao;

import com.fengqun.fengqunspotticket.entity.Ticket;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:40
 */
public interface TicketDao {
    void addTicket(Ticket ticket);
    void  deleteById(long id);
    void updateTicket(Ticket ticket);
    //查询详情和修改前回显数据fcvcvdsdsdbdjsbss
    Ticket findById(long id);



    //查询全部
    List<Ticket> findALLTicket();
}
