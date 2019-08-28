package com.fengqun.fengqunspotticket.service.Impl;

import com.fengqun.fengqunspotticket.dao.SpotDao;
import com.fengqun.fengqunspotticket.entity.Spot;
import com.fengqun.fengqunspotticket.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 13:11
 */
@Service
public class SpotServiceImpl implements SpotService {
    @Autowired
    private SpotDao spotDao;


    @Override
    public void addSpot(Spot spot)
    {
        spotDao.insertSpot(spot);
    }

    @Override
    public void deleteSpot(long id) {
        spotDao.deleteById(id);
    }

    @Override
    public void updateSpot(Spot spot) {
         spotDao.updateSpot(spot);
    }

    @Override
    public List<Spot> findALLSpot() {
        List<Spot> spotList = spotDao.findALLSpot();
        return spotList;
    }

    @Override
    public Spot findById(long id) {
        Spot spot = spotDao.findById(id);
        return spot;
    }

}
