package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


import java.util.Date;

/**
 * @Author: LCM
 * @Date: 2019/7/22 9:27
 */
@Data
public class Manager {
@TableId(value="id",type= IdType.AUTO)
    private  long id;
    private  long spotId;
    private  String  loginPhone;
    private  String password;
    private  String power;
    //用户注册时间
//    private Date ct;



}
