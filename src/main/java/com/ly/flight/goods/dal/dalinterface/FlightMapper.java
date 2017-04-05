/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.dalinterface;

import com.ly.flight.goods.dal.dataobject.FlightDO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: FlightMapper.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface FlightMapper {
    /**
     * 航司的插入
     * @param flightDO
     * @return
     */
    int insertFlight(FlightDO flightDO);

    /**
     * 航司的删除
     * @param flightID
     * @return
     */
    int deleteFlight(String flightID);

    /**
     * 更新一个航司的信息
     * @param flightDO
     * @return
     */
    int updateFlight(FlightDO flightDO);

    /**
     * 查询所有航司的信息
     * @return
     */
    List<FlightDO> selectAllFlights();

    /**
     * 根据航司ID查询航司信息
     * @param flightID
     * @return
     */
    FlightDO selectFlight(String flightID);

}
