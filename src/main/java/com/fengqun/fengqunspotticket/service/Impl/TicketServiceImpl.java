package com.fengqun.fengqunspotticket.service.Impl;

import com.fengqun.fengqunspotticket.dao.TicketDao;
import com.fengqun.fengqunspotticket.entity.Ticket;
import com.fengqun.fengqunspotticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 15:53
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketDao ticketDao;

    @Override
    public void addTicket(Ticket ticket) {
        ticketDao.addTicket(ticket);

    }

    @Override
    public void deleteById(long id) {
        ticketDao.deleteById(id);
    }

    @Override
    public void updateTicket(Ticket ticket) {
        ticketDao.updateTicket(ticket);
    }

    @Override
    public Ticket findById(long id) {
        Ticket ticket = ticketDao.findById(id);
        return ticket;
    }

    @Override
    public List<Ticket> findALLTicket() {
        List<Ticket> ticketList = ticketDao.findALLTicket();
        return ticketList;
    }
}
