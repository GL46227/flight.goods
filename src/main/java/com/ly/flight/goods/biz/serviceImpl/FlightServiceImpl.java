/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.serviceImpl;

import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.FlightVO;
import com.ly.flight.goods.biz.mapper.BaseMapper;
import com.ly.flight.goods.biz.service.FlightService;
import com.ly.flight.goods.dal.dalinterface.FlightMapper;
import com.ly.flight.goods.dal.dataobject.FlightDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: FlightServiceImpl.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class FlightServiceImpl implements FlightService{
    private static final Logger logger = LoggerFactory.getLogger(FlightServiceImpl.class);
    @Resource
    private FlightMapper flightMapper;

    public Integer addFlight(FlightVO flightVO) throws GoodsException {
        FlightDO flightDO= BaseMapper.flightVO2flightDO(flightVO);
        return flightMapper.insertFlight(flightDO);
    }

    public Integer removeFlight(String flightID) throws GoodsException {
        return  flightMapper.deleteFlight(flightID);
    }

    public Integer updateFlight(FlightVO flightVO) throws GoodsException {
        FlightDO flightDO= BaseMapper.flightVO2flightDO(flightVO);
        return flightMapper.updateFlight(flightDO);
    }

    public List<FlightVO> getAllFlights() throws GoodsException {
        List<FlightDO> list= flightMapper.selectAllFlights();
        List<FlightVO> listVO=new ArrayList<FlightVO>();
        for (FlightDO flightDO:list
             ) {
            FlightVO flightVO=BaseMapper.flightDO2flightVO(flightDO);
            listVO.add(flightVO);
        }
        return listVO;

    }

    public FlightVO getFlight(String flightID) throws GoodsException {
        return BaseMapper.flightDO2flightVO(flightMapper.selectFlight(flightID));
    }
}
