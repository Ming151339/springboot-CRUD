package com.fengqun.fengqunspotticket.service;

import com.fengqun.fengqunspotticket.dao.ManagerDao;
import com.fengqun.fengqunspotticket.entity.Manager;

/**
 * @Author: LCM
 * @Date: 2019/7/23 11:37
 */
public interface ManagerService {
    Manager loginManager(Manager manager);
}
