package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.exception.TicketException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: LCM
 * @Date: 2019/7/22 10:14
 */
@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(TicketException.class)
    public ResponseVo myExceptionHandler(TicketException ex){

        ResponseVo vo = new ResponseVo();
        vo.setCode(ex.getCode());
        vo.setMessage(ex.getMessage());
        return vo;
    }


}
