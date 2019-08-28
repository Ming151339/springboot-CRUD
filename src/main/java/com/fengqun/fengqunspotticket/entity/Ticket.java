package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Author: LCM
 * @Date: 2019/7/20 0:41
 */
@Data
public class Ticket {
    @TableId(value="id",type= IdType.AUTO)
    //BIGINT 类型的 Java 映射的推荐类型是 Java long 类型。
    private  long id;
    private  long spotId;
    private  String ticketName;
    //float
    private double price;
    //float
    private double originalPrice;

    private  Integer ticketType;
    private Date ct;

}
