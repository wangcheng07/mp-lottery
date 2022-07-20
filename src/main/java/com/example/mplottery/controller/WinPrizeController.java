package com.example.mplottery.controller;

import com.example.mplottery.entity.WinPrize;
import com.example.mplottery.mapper.WinPrizeMapper;
import com.example.mplottery.service.WinPrizeService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangcheng07
 */
@RestController
@RequestMapping("/prize")
public class WinPrizeController {

    @Autowired
    private WinPrizeService winPrizeService;

    /**
     * 新增中奖信息
     * @param winPrize
     * @return
     */
    @PostMapping(value = "/addWinPrize")
    public Boolean addWinPrize(@RequestBody WinPrize winPrize) {
        var res = winPrizeService.addWinPrize(winPrize);

        return  res>0?true:false;
    }

    /**
     * 查询中奖信息
     * @param lotteryID
     * @return
     */
    @PostMapping(value = "/selectWinPrizeList")
    public List<WinPrize> selectWinPrizeList(Integer lotteryID) {
        var res = winPrizeService.selectWinPrizeList(lotteryID);

        return res;
    }

}
