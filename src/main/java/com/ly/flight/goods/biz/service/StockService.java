/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.service;

import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.StockVO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: StockService.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface StockService {
    /**
     * 增加一条舱位信息
     * @param stockVO
     * @return
     */
    Integer addStock(StockVO stockVO)throws GoodsException;

    /**
     * 删除一条舱位信息
     * @param stockID
     * @return
     */
    Integer removeStock(String stockID)throws GoodsException;

    /**
     * 修改一条舱位信息
     * @param stockVO
     * @return
     */
    Integer updateStock(StockVO stockVO)throws GoodsException;

    /**
     * 获取所有的舱位信息
     * @return
     */
    List<StockVO> getAllStocks()throws GoodsException;

    /**
     * 根据舱位ID获取舱位信息
     * @param stockID
     * @return
     */
    StockVO getStock(String stockID)throws GoodsException;

    /**
     * 根据航程ID获取舱位信息
     * @param lineID
     * @return
     */
    List<StockVO> getStockByLineID(String lineID)throws GoodsException;

    /**
     * 根据航司ID获取舱位信息
     * @param flightID
     * @return
     */
    List<StockVO> getStockByFlightID(String flightID)throws GoodsException;

}
