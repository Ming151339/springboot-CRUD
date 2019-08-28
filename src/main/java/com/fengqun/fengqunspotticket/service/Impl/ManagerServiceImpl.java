package com.fengqun.fengqunspotticket.service.Impl;

import com.fengqun.fengqunspotticket.dao.ManagerDao;
import com.fengqun.fengqunspotticket.entity.Manager;
import com.fengqun.fengqunspotticket.exception.TicketException;
import com.fengqun.fengqunspotticket.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: LCM
 * @Date: 2019/7/23 11:35
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private  ManagerDao managerDao;


    @Override
    public Manager loginManager(Manager manager) {
        Manager dbmanager = managerDao.loginManager(manager);

        if (dbmanager==null){
            //告诉用户 403004 手机号错误 todo?
            throw  new TicketException(403004,"手机号不存在 ");

        }
        if (!dbmanager.getPassword().equals(manager.getPassword())) {
            //告诉用户 403005 密码错误 todo?
            throw new TicketException(403005, "密码错误");
        }

        return dbmanager;
    }
}
