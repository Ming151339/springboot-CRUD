package com.fengqun.fengqunspotticket.exception;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:30
 */
public class TicketException extends  RuntimeException  {
    private  Integer code;
    public  TicketException(Integer code,String message){
        //message 参数赋值给父类的message属性
        super(message);
        //code 参数赋给当前类的属性
        this.code=code;
    }

    public Integer getCode() {
        return code;
    }
}
