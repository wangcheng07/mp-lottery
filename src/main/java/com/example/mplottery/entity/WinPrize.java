package com.example.mplottery.entity;

import lombok.Data;

/**
 * @author wangcheng07
 */
@Data
public class WinPrize {
    /**
     * 主键ID
     */
    private Integer  id;

    /**
     * 抽奖ID
     */
    private Integer lotteryID;

    /**
     * 姓名
     */
    private String name;

    /**
     * 奖品ID
     */
    private Integer prizeID;

    /**
     * 奖品名称
     */
    private String prizeName;


}
