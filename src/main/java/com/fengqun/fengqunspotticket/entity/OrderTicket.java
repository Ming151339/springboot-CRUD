package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:00
 */
@Data
public class OrderTicket {
    @TableId(value="id",type= IdType.AUTO)
    private  long id;
    private  long spotId;
    private  long ticketId;
    private  long orderId;
    private  long memberId;
    private  Integer quantity;

    //mediumblob, mediumblob
    private  String faceFeature;

    private  String ticketName;
    //float,price
    private BigDecimal price;
    //float，originalPrice
    private BigDecimal originalPrice;
    private  Integer ticketType;
    private Date ct;


}
