package com.fengqun.fengqunspotticket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengqun.fengqunspotticket.entity.Manager;
import com.fengqun.fengqunspotticket.entity.Member;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:38
 */
public interface MemberDao extends BaseMapper<Member> {
    void  insertMember(Member member);

}
