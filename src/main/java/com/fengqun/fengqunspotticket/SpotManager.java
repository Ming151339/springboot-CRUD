package com.fengqun.fengqunspotticket;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:04
 */
@Data
public class SpotManager {
//`id` int NOT NULL  AUTO_INCREMENT,
//`spotId` int NULL COMMENT '景区ID',
//`loginPhone` varchar(255) NULL COMMENT '登录手机号',
//`password` varchar(255) NULL COMMENT '登录密码',
//`power` varchar(255) NULL COMMENT '账号权限',
    @TableId(value="id",type= IdType.AUTO)
    private  Integer id;
    private  Integer spotId;
    private  String loginPhone;
    private  String password;
    private  String power;







}
