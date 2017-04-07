/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.flight.core.goods.DTO.FlightDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.core.goods.SingleResult;
import com.ly.flight.core.goods.facade.FlightFacade;
import com.ly.flight.goods.biz.VO.FlightVO;
import com.ly.flight.goods.biz.enums.CommonStatus;
import com.ly.flight.goods.biz.mapper.BaseMapper;
import com.ly.flight.goods.biz.service.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: FlightFacadeImpl.java, v0.1 2017/4/6 gl46227 Exp $$
 */
@Service
public class FlightFacadeImpl implements FlightFacade {
    private final static Logger logger = LoggerFactory.getLogger(FlightFacadeImpl.class);
    @Resource
    private FlightService flightService;

    public SingleResult<String> addFlight(FlightDTO flightDTO) {
        Assert.notNull(flightDTO,"flightDTO must be not null");
        try {
            FlightVO flightVO= BaseMapper.flightDTO2VO(flightDTO);
            if (flightService.addFlight(flightVO)==1)
                return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        }catch (GoodsException e){
            logger.error("Add Flight happens some Error");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(), CommonStatus.UNKNOW.getMsg(), "UNKNOW");
        }
    }



    public SingleResult<String> removeFlight(String s) {
        Assert.notNull(s,"FlightID must be not null");
        try {
            if (flightService.removeFlight(s)==1)
                return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        } catch (GoodsException e) {
            logger.error("Remove Flight happens some Error");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(), CommonStatus.UNKNOW.getMsg(), "UNKNOW");
        }
    }



    public SingleResult<Integer> updateFlight(FlightDTO flightDTO) {
        Assert.notNull(flightDTO,"flightDTO cant be null");
        try {
            FlightVO flightVO=BaseMapper.flightDTO2VO(flightDTO);
            Integer result=flightService.updateFlight(flightVO);
            return new SingleResult<Integer>(CommonStatus.SUCCESS.code,CommonStatus.SUCCESS.msg , result);
        }catch (GoodsException e){
            logger.error("Update Flight happens some Error");
            return new SingleResult<Integer>(CommonStatus.FAIL.code,CommonStatus.FAIL.msg , null);
        }
    }

    public SingleResult<List<FlightDTO>> getAllFlights() {
        try {
            List<FlightVO> flightVOList=flightService.getAllFlights();
            List<FlightDTO> flightDTOList=new ArrayList<FlightDTO>();
            for (FlightVO flightVO:flightVOList
                 ) {
                    FlightDTO flightDTO=BaseMapper.flightVO2DTO(flightVO);
                flightDTOList.add(flightDTO);
            }
            return new SingleResult<List<FlightDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),flightDTOList);
        } catch (GoodsException e) {
            logger.error("GetAllFlight happens some Error");
            return new SingleResult<List<FlightDTO>>(CommonStatus.FAIL.code,CommonStatus.FAIL.msg , null);
        }
    }

    public SingleResult<FlightDTO> getFlight(String s) {
        try {
            FlightDTO flightDTO=BaseMapper.flightVO2DTO(flightService.getFlight(s));
            return new SingleResult<FlightDTO>(CommonStatus.SUCCESS.code,CommonStatus.SUCCESS.msg , flightDTO);
        } catch (GoodsException e) {
            logger.error("GetAllFlightByFlightID happens some Error");
            return new SingleResult<FlightDTO>(CommonStatus.FAIL.code,CommonStatus.FAIL.msg , null);
        }
    }
}
