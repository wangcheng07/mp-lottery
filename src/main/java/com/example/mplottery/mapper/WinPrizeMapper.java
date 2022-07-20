package com.example.mplottery.mapper;

import com.example.mplottery.entity.WinPrize;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangcheng07
 */
@Mapper
public interface WinPrizeMapper {

    /**
     * 新增中奖信息
     * @param entity
     * @return
     */
    int addWinPrize(WinPrize entity);


    /**
     * 查询中奖信息
     * @param lotteryID
     * @return
     */
    List<WinPrize> selectWinPrizeList(Integer lotteryID);

}
