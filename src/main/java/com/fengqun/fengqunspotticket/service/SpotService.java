package com.fengqun.fengqunspotticket.service;


import com.fengqun.fengqunspotticket.entity.Spot;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:28
 */
public interface SpotService {
    void addSpot(Spot spot);
    void  deleteSpot(long id);
    void updateSpot(Spot spot);
    Spot findById(long id);

    //根据景区名称进行模糊查询
//    Spot findBySpotName(String spotName);
    //查询全部
    List<Spot> findALLSpot();


}
