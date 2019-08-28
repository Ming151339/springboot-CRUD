package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.entity.Member;
import com.fengqun.fengqunspotticket.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:35
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/register")
    public ResponseVo register(@RequestBody Member member){
        Member registerMember = memberService.register(member);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(registerMember);
        return  vo;
    }


}
