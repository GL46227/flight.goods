/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.daointerface;

import com.ly.flight.goods.dal.dataobject.StockDO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: StockMapper.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface StockMapper {

    /**
     * 插入一条舱位信息
     * @param stockDO
     * @return
     */
    int insertStock(StockDO stockDO);

    /**
     * 删除一条舱位信息
     * @param stockID
     * @return
     */
   int deleteStock(String stockID);

    /**
     * 更新舱位信息
     * @param stockDO
     * @return
     */
    int updateStock(StockDO stockDO);

    /**
     * 获取所有的舱位信息
     * @return
     */
    List<StockDO> selectStocks();

    /**
     * 根据ID获取舱位消息
     * @param stockID
     * @return
     */
    StockDO selectStock(String stockID);


    /**
     * 根据航程来查询舱位的信息
     * @param lineID
     * @return
     */
   List<StockDO> selectStockByLineID(String lineID);

    /**
     * 根据航司ID获取舱位信息
     * @param flightID
     * @return
     */
    List<StockDO>selectStockByFlightID(String flightID);

}
