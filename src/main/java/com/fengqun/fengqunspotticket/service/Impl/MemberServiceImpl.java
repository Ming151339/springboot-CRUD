package com.fengqun.fengqunspotticket.service.Impl;

import com.fengqun.fengqunspotticket.dao.MemberDao;
import com.fengqun.fengqunspotticket.entity.Member;
import com.fengqun.fengqunspotticket.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:58
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;


    @Override
    public Member register(Member member)
    {

         memberDao.insertMember(member);
         return member;
    }


}
