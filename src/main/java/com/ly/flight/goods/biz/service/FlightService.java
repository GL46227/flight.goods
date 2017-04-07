/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.service;

import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.FlightVO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: FlightService.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface FlightService {
    /**
     * 增加一条航司信息
     * @param flightVO
     * @return
     */
    Integer addFlight(FlightVO flightVO) throws GoodsException;

    /**
     * 删除一条航司信息
     * @param flightID
     * @return
     */
    Integer removeFlight(String flightID) throws GoodsException;

    /**
     * 修改一条航程信息
     * @param flightVO
     * @return
     */
    Integer updateFlight(FlightVO flightVO) throws GoodsException;

    /**
     * 获取所有的航程信息
     * @return
     */
   List<FlightVO> getAllFlights() throws GoodsException;

    /**
     * 获取单个航司信息
     * @param flightID
     * @return
     */
    FlightVO getFlight(String flightID) throws GoodsException;
}
