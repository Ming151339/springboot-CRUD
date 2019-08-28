package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.entity.Manager;
import com.fengqun.fengqunspotticket.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: LCM
 * @Date: 2019/7/23 11:54
 */
@RestController
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private HttpSession session;

    @PostMapping("/login")
    public ResponseVo login (@RequestBody Manager manager){
        Manager loginManager = managerService.loginManager(manager);
        session.setAttribute("loginManager",loginManager);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(loginManager);
        //返回ResponseVo对象
        return vo;
    }
}
