/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.mapper;

import com.ly.flight.core.goods.DTO.*;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.FlightVO;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.VO.LineVO;
import com.ly.flight.goods.biz.VO.StockVO;
import com.ly.flight.goods.dal.dataobject.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author gl46227
 * @version $Id: GoodsMapper.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class GoodsMapper {

    /**
     * LineDTO转VO
     *
     * @param lineDTO
     * @return
     */
    public static LineVO lineDTO2VO(LineDTO lineDTO) throws GoodsException {
        if (lineDTO == null)
            throw new GoodsException("lineDTO is null");
        LineVO lineVO = new LineVO();
        lineVO.setLineID(lineDTO.getLineID());
        lineVO.setStartDate(lineDTO.getStartDate());
        lineVO.setStartCity(lineDTO.getStartCity());
        lineVO.setFinishCity(lineDTO.getFinishCity());
        lineVO.setFinishAirport(lineDTO.getFinishAirport());
        lineVO.setFlightID(lineDTO.getFlightID());
        lineVO.setFinishTime(lineDTO.getFinishTime());
        lineVO.setGate(lineDTO.getGate());
        lineVO.setMiddleAirport(lineDTO.getMiddleAirport());
        lineVO.setMiddleCity(lineDTO.getMiddleCity());
        lineVO.setMiddleTime(lineDTO.getMiddleTime());
        lineVO.setTaxMoney(lineDTO.getTaxMoney());
        lineVO.setStartAirport(lineDTO.getStartAirport());
        lineVO.setStartTime(lineDTO.getStartTime());
        return lineVO;
    }

    /**
     * LineVO转DTO
     *
     * @param lineVO
     * @return
     */
    public static LineDTO lineVO2DTO(LineVO lineVO) throws GoodsException {
        if (lineVO == null)
            throw new GoodsException("lineVO is null");
        LineDTO lineDTO = new LineDTO();
        lineDTO.setLineID(lineVO.getLineID());
        lineDTO.setStartDate(lineVO.getStartDate());
        lineDTO.setStartCity(lineVO.getStartCity());
        lineDTO.setFinishCity(lineVO.getFinishCity());
        lineDTO.setFinishAirport(lineVO.getFinishAirport());
        lineDTO.setFlightID(lineVO.getFlightID());
        lineDTO.setFinishTime(lineVO.getFinishTime());
        lineDTO.setGate(lineVO.getGate());
        lineDTO.setMiddleAirport(lineVO.getMiddleAirport());
        lineDTO.setMiddleCity(lineVO.getMiddleCity());
        lineDTO.setMiddleTime(lineVO.getMiddleTime());
        lineDTO.setTaxMoney(lineVO.getTaxMoney());
        lineDTO.setStartAirport(lineVO.getStartAirport());
        lineDTO.setStartTime(lineVO.getStartTime());
        return lineDTO;
    }


    /**
     * LineVO转LineDO
     *
     * @param lineVO
     * @return
     * @throws GoodsException
     */
    public static LineDO lineVO2lineDO(LineVO lineVO) throws GoodsException {
        if (lineVO == null)
            throw new GoodsException("lineVO is null");
        LineDO lineDO = new LineDO();
        lineDO.setLineID(lineVO.getLineID());
        lineDO.setStartDate(lineVO.getStartDate());
        lineDO.setStartCity(lineVO.getStartCity());
        lineDO.setFinishCity(lineVO.getFinishCity());
        lineDO.setFinishAirport(lineVO.getFinishAirport());
        lineDO.setFlightID(lineVO.getFlightID());
        lineDO.setFinishTime(lineVO.getFinishTime());
        lineDO.setGate(lineVO.getGate());
        lineDO.setMiddleAirport(lineVO.getMiddleAirport());
        lineDO.setMiddleCity(lineVO.getMiddleCity());
        lineDO.setMiddleTime(lineVO.getMiddleTime());
        lineDO.setTaxMoney(lineVO.getTaxMoney());
        lineDO.setStartAirport(lineVO.getStartAirport());
        lineDO.setStartTime(lineVO.getStartTime());
        return lineDO;
    }


    /**
     * LineDO转LineVO
     *
     * @param lineDO
     * @return
     * @throws GoodsException
     */
    public static LineVO lineDO2lineVO(LineDO lineDO) throws GoodsException {
        if (lineDO == null)
            throw new GoodsException("lineDO is null");
        LineVO lineVO = new LineVO();
        lineVO.setLineID(lineDO.getLineID());
        lineVO.setStartDate(lineDO.getStartDate());
        lineVO.setStartCity(lineDO.getStartCity());
        lineVO.setFinishCity(lineDO.getFinishCity());
        lineVO.setFinishAirport(lineDO.getFinishAirport());
        lineVO.setFlightID(lineDO.getFlightID());
        lineVO.setFinishTime(lineDO.getFinishTime());
        lineVO.setGate(lineDO.getGate());
        lineVO.setMiddleAirport(lineDO.getMiddleAirport());
        lineVO.setMiddleCity(lineDO.getMiddleCity());
        lineVO.setMiddleTime(lineDO.getMiddleTime());
        lineVO.setTaxMoney(lineDO.getTaxMoney());
        lineVO.setStartAirport(lineDO.getStartAirport());
        lineVO.setStartTime(lineDO.getStartTime());
        return lineVO;
    }

    /**
     * 用户查询DTO转DO
     *
     * @param userLineDTO
     * @return
     * @throws GoodsException
     */
    public static UserLineDO userLineDTO2UserLineDO(UserLineDTO userLineDTO) throws GoodsException {
        if (userLineDTO == null)
            throw new GoodsException("userLineDTO is null");
        UserLineDO userLineDO = new UserLineDO();
        userLineDO.setFinishCity(userLineDTO.getFinishCity());
        userLineDO.setStartCity(userLineDTO.getStartCity());
        userLineDO.setStartDate(userLineDTO.getStartDate());
        return userLineDO;
    }


    /**
     * 用户显示VO转DTO
     *
     * @param lineShowVO
     * @return
     * @throws GoodsException
     */
    public static LineShowDTO lineShowVO2lineShowDTO(LineShowVO lineShowVO) throws GoodsException {
        if (lineShowVO == null)
            throw new GoodsException("lineShowVO is null");
        LineShowDTO lineShowDTO = new LineShowDTO();
        lineShowDTO.setLineID(lineShowVO.getLineID());
        lineShowDTO.setStartDate(lineShowVO.getStartDate());
        lineShowDTO.setStartCity(lineShowVO.getStartCity());
        lineShowDTO.setFinishCity(lineShowVO.getFinishCity());
        lineShowDTO.setFinishAirport(lineShowVO.getFinishAirport());
        List<FlightDTO> listFlightDTO = new ArrayList<FlightDTO>();
        List<FlightVO> flightVOList = lineShowVO.getFlightVOList();
        for (FlightVO flightVO : flightVOList
                ) {
            FlightDTO flightDTO = BaseMapper.flightVO2DTO(flightVO);
            listFlightDTO.add(flightDTO);
        }
        lineShowDTO.setFlightDTOList(listFlightDTO);
        lineShowDTO.setFinishTime(lineShowVO.getFinishTime());
        lineShowDTO.setGate(lineShowVO.getGate());
        lineShowDTO.setMiddleAirport(lineShowVO.getMiddleAirport());
        lineShowDTO.setMiddleCity(lineShowVO.getMiddleCity());
        lineShowDTO.setMiddleTime(lineShowVO.getMiddleTime());
        lineShowDTO.setTaxMoney(lineShowVO.getTaxMoney());
        lineShowDTO.setStartAirport(lineShowVO.getStartAirport());
        lineShowDTO.setStartTime(lineShowVO.getStartTime());
        List<StockVO> listStockVO = lineShowVO.getStockVOList();
        List<StockDTO> listStockDTO = new ArrayList<StockDTO>();
        for (StockVO stockVO : listStockVO
                ) {
            StockDTO stockDTO = BaseMapper.stockVO2DTO(stockVO);
            listStockDTO.add(stockDTO);
        }
        lineShowDTO.setStockDTOList(listStockDTO);
        return lineShowDTO;
    }


    /**
     * 用户DO转DTO
     *
     * @param userLineDO
     * @return
     * @throws GoodsException
     */
    public static UserLineDTO userLineDO2UserLineDTO(UserLineDO userLineDO) throws GoodsException {
        if (userLineDO == null)
            throw new GoodsException("userLineDTO is null");
        UserLineDTO userLineDTO = new UserLineDTO();
        userLineDTO.setFinishCity(userLineDO.getFinishCity());
        userLineDTO.setStartCity(userLineDO.getStartCity());
        userLineDTO.setStartDate(userLineDO.getStartDate());
        return userLineDTO;
    }


    /**
     * 用户显示DO转VO
     *
     * @param lineShowDO
     * @return
     * @throws GoodsException
     */
    public static LineShowVO lineShowDO2lineShowVO(LineShowDO lineShowDO) throws GoodsException {
        if (lineShowDO == null)
            throw new GoodsException("lineShowDO is null");
        LineShowVO lineShowVO = new LineShowVO();
        lineShowVO.setLineID(lineShowDO.getLineID());
        lineShowVO.setStartDate(lineShowDO.getStartDate());
        lineShowVO.setStartCity(lineShowDO.getStartCity());
        lineShowVO.setFinishCity(lineShowDO.getFinishCity());
        lineShowVO.setFinishAirport(lineShowDO.getFinishAirport());
        List<FlightVO> flightVOList = new ArrayList<FlightVO>();
        List<FlightDO> flightDOList = lineShowDO.getFlightDOList();
        for (FlightDO flightDO : flightDOList
                ) {
            FlightVO flightVO = BaseMapper.flightDO2flightVO(flightDO);
            flightVOList.add(flightVO);
        }
        lineShowVO.setFlightVOList(flightVOList);
        lineShowVO.setFinishTime(lineShowDO.getFinishTime());
        lineShowVO.setGate(lineShowDO.getGate());
        lineShowVO.setMiddleAirport(lineShowDO.getMiddleAirport());
        lineShowVO.setMiddleCity(lineShowDO.getMiddleCity());
        lineShowVO.setMiddleTime(lineShowDO.getMiddleTime());
        lineShowVO.setTaxMoney(lineShowDO.getTaxMoney());
        lineShowVO.setStartAirport(lineShowDO.getStartAirport());
        lineShowVO.setStartTime(lineShowDO.getStartTime());
        List<StockDO> listStockDO = lineShowDO.getStockDOList();
        List<StockVO> listStockVO = new ArrayList<StockVO>();
        for (StockDO stockDO : listStockDO
                ) {
            StockVO stockVO = BaseMapper.stockDO2stockVO(stockDO);
            listStockVO.add(stockVO);
        }
        lineShowVO.setStockVOList(listStockVO);
        return lineShowVO;
    }


    /**
     * 用户显示VO转DO
     *
     * @param lineShowVO
     * @return
     * @throws GoodsException
     */
    public static LineShowDO lineShowVO2lineShowDO(LineShowVO lineShowVO) throws GoodsException {
        if (lineShowVO == null)
            throw new GoodsException("lineShowVO is null");
        LineShowDO lineShowDO = new LineShowDO();
        lineShowDO.setLineID(lineShowVO.getLineID());
        lineShowDO.setStartDate(lineShowVO.getStartDate());
        lineShowDO.setStartCity(lineShowVO.getStartCity());
        lineShowDO.setFinishCity(lineShowVO.getFinishCity());
        lineShowDO.setFinishAirport(lineShowVO.getFinishAirport());
        List<FlightDO> flightDOList = new ArrayList<FlightDO>();
        List<FlightVO> flightVOList = lineShowVO.getFlightVOList();
        for (FlightVO flightVO : flightVOList
                ) {
            FlightDO flightDO = BaseMapper.flightVO2flightDO(flightVO);
            flightDOList.add(flightDO);
        }
        lineShowDO.setFlightDOList(flightDOList);
        lineShowDO.setFinishTime(lineShowVO.getFinishTime());
        lineShowDO.setGate(lineShowVO.getGate());
        lineShowDO.setMiddleAirport(lineShowVO.getMiddleAirport());
        lineShowDO.setMiddleCity(lineShowVO.getMiddleCity());
        lineShowDO.setMiddleTime(lineShowVO.getMiddleTime());
        lineShowDO.setTaxMoney(lineShowVO.getTaxMoney());
        lineShowDO.setStartAirport(lineShowVO.getStartAirport());
        lineShowDO.setStartTime(lineShowVO.getStartTime());
        List<StockVO> listStockVO = lineShowVO.getStockVOList();
        List<StockDO> listStockDO = new ArrayList<StockDO>();
        for (StockVO stockVO : listStockVO
                ) {
            StockDO stockDO = BaseMapper.stockVO2stockDO(stockVO);
            listStockDO.add(stockDO);
        }
        lineShowDO.setStockDOList(listStockDO);
        return lineShowDO;
    }


}
