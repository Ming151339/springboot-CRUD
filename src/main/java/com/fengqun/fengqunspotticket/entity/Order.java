package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Author: LCM
 * @Date: 2019/7/20 0:45
 */
@Data
public class Order {
    @TableId(value="id",type= IdType.AUTO)
    private  long id;
    private  String orderNumber;
    private  long memberId;
    private  long spotId;
    private double orderPrice;
    private  String state;
    private  String paycode;
    //mediumblob
    private  String faceFeature;
    private Date ct;

}
