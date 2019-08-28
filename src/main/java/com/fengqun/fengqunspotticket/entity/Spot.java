package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Author: LCM
 * @Date: 2019/7/20 0:37
 */
@Data
public class Spot {
    @TableId(value="id",type= IdType.AUTO)
    private  long id;
    private  String spotName;
    private  String spotAddress;
    private  String openingHours;
    private  String profile;
    private Date ct;
    private  String  headImage;



}
