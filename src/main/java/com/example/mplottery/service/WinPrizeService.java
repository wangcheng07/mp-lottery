package com.example.mplottery.service;

import com.example.mplottery.entity.WinPrize;
import com.example.mplottery.mapper.WinPrizeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangcheng07
 */
@Service
public class WinPrizeService {

    @Autowired
    private WinPrizeMapper winPrizeMapper;

    /**
     * 新增中奖信息
     * @param entity
     * @return
     */
    public int addWinPrize(WinPrize entity)
    {

        return winPrizeMapper.addWinPrize(entity);
    }

    /**
     * 查询中奖信息
     * @param lotteryID
     * @return
     */
    public List<WinPrize> selectWinPrizeList(Integer lotteryID)
    {

        return winPrizeMapper.selectWinPrizeList(lotteryID);
    }
}
