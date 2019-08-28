package com.fengqun.fengqunspotticket.controller;

import com.fengqun.fengqunspotticket.ResponseVo.ResponseVo;
import com.fengqun.fengqunspotticket.entity.Spot;
import com.fengqun.fengqunspotticket.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: LCM
 * @Date: 2019/7/23 14:00
 */
@RestController
public class SpotController {
    @Autowired
    private SpotService spotService;

    //查询景区详情和修改前回显数据
    @GetMapping("/spot/{id}/spot_details")
    public ResponseVo spot_details(@RequestParam("id") long id ){
        Spot spot = spotService.findById(id);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(spot);
        return vo;
    }
    //查询全部景区详情
    @GetMapping("/spots")
    public ResponseVo listSpot( ){
        List<Spot> spotList = spotService.findALLSpot();
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(spotList);
        return vo;
    }
    //修改景区
    @PutMapping("/spot_update")
    public ResponseVo updateSpot(@RequestBody Spot spot){
        spotService.updateSpot(spot);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        return vo;
    }
    //删除景区
    @DeleteMapping("/spot/{id}")
    public  ResponseVo deleteSpot(@PathVariable("id") long id){

       spotService.deleteSpot(id);
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        return  vo;
    }
    //添加景区
    @PostMapping("/spot_insert")
    public ResponseVo insertSpot(@RequestBody Spot spot) {

            spotService.addSpot(spot);
            ResponseVo vo = new ResponseVo();
            vo.setCode(200);
            return vo;
    }
}
