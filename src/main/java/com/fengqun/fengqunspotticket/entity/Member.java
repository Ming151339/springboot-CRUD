package com.fengqun.fengqunspotticket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: LCM
 * @Date: 2019/7/20 0:36
 */
@Data
public class Member {
    @TableId(value="id",type= IdType.AUTO)
    private  long id;
    private  long openId;
    private  String nickName;
    private  String  sex;
    private  String  language;
    private  String  city;
    private  String  province;
    private  String  country;
    private  String  headimgurl;
    private Timestamp ct;











}
