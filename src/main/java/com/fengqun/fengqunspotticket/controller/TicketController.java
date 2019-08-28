package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.entity.Ticket;
import com.fengqun.fengqunspotticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 15:56
 */
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;


    //查询门票详情和修改前回显数据
    @GetMapping("/ticket/{id}/ticket_details")
    public ResponseVo ticket_details(@RequestParam("id") long id ){
        Ticket ticket = ticketService.findById(id);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(ticket);
        return vo;
    }
    //查询全部门票
    @GetMapping("/tickets")
    public ResponseVo listTicket( ){
        List<Ticket> ticketList = ticketService.findALLTicket();
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(ticketList);
        return vo;
    }


    //修改门票
    @PutMapping("/ticket_update")
    public ResponseVo updateTicket(@RequestBody Ticket ticket){
        ticketService.updateTicket(ticket);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        return vo;
    }
    //删除门票
    @DeleteMapping("/ticket/{id}")
    public  ResponseVo deleteTicket(@PathVariable("id") long id){

        ticketService.deleteById(id);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        return  vo;
    }
    //添加门票
    @PostMapping("/ticket_insert")
    public ResponseVo insertTicket(@RequestBody Ticket ticket) {

        ticketService.addTicket(ticket);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        return vo;
    }




}
