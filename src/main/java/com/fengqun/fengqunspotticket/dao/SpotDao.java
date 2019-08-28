package com.fengqun.fengqunspotticket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengqun.fengqunspotticket.entity.Spot;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:39
 */
public interface SpotDao  extends BaseMapper<Spot> {
    void insertSpot(Spot spot);
    void  deleteById(long id);
    void updateSpot(Spot spot);
    Spot findBySpotName(String spotName);
    Spot findById(long id);
    //查询全部
    List<Spot> findALLSpot();


}
