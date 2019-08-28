package com.fengqun.fengqunspotticket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengqun.fengqunspotticket.entity.Manager;

/**
 * @Author: LCM
 * @Date: 2019/7/23 11:32
 */
public interface ManagerDao extends BaseMapper<Manager> {
    Manager loginManager(Manager manager);

}
