/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.mapper;

import com.ly.flight.core.goods.DTO.UserLineDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.FlightVO;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.VO.LineVO;
import com.ly.flight.goods.biz.VO.StockVO;
import com.ly.flight.goods.dal.dataobject.*;


/**
 * @author gl46227
 * @version $Id: GoodsMapper.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class GoodsMapper {

    /**
     * 航司DO转VO
     *
     * @param flightDO
     * @return
     * @throws GoodsException
     */
    public static FlightVO flightDO2flightVO(FlightDO flightDO) throws GoodsException {
        if (flightDO == null)
            throw new GoodsException("flightDO is null");
        FlightVO flightVO = new FlightVO();
        flightVO.setFlightID(flightDO.getFlightID());
        flightVO.setFlightName(flightDO.getFlightName());
        flightVO.setPlaneType(flightDO.getPlaneType());
        return flightVO;

    }

    /**
     * 航司VO转DO
     *
     * @param flightVO
     * @return
     * @throws GoodsException
     */
    public static FlightDO flightVO2flightDO(FlightVO flightVO) throws GoodsException {
        if (flightVO == null)
            throw new GoodsException("flightVO is null");
        FlightDO flightDO = new FlightDO();
        flightDO.setPlaneType(flightVO.getPlaneType());
        flightDO.setFlightName(flightVO.getFlightName());
        flightDO.setFlightID(flightVO.getFlightID());
        return flightDO;
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
        lineShowVO.setFlightDOList(lineShowDO.getFlightDOList());
        lineShowVO.setFinishTime(lineShowDO.getFinishTime());
        lineShowVO.setGate(lineShowDO.getGate());
        lineShowVO.setMiddleAirport(lineShowDO.getMiddleAirport());
        lineShowVO.setMiddleCity(lineShowDO.getMiddleCity());
        lineShowVO.setMiddleTime(lineShowDO.getMiddleTime());
        lineShowVO.setTaxMoney(lineShowDO.getTaxMoney());
        lineShowVO.setStartAirport(lineShowDO.getStartAirport());
        lineShowVO.setStartTime(lineShowDO.getStartTime());
        return lineShowVO;
    }


    /**
     * 用户显示VO转DO
     * @param lineShowVO
     * @return
     * @throws GoodsException
     */
    public static LineShowDO lineShowVO2lineShowDO(LineShowVO lineShowVO) throws GoodsException{
        if (lineShowVO == null)
            throw new GoodsException("lineShowVO is null");
        LineShowDO lineShowDO = new LineShowDO();
        lineShowDO.setLineID(lineShowVO.getLineID());
        lineShowDO.setStartDate(lineShowVO.getStartDate());
        lineShowDO.setStartCity(lineShowVO.getStartCity());
        lineShowDO.setFinishCity(lineShowVO.getFinishCity());
        lineShowDO.setFinishAirport(lineShowVO.getFinishAirport());
        lineShowDO.setFlightDOList(lineShowVO.getFlightDOList());
        lineShowDO.setFinishTime(lineShowVO.getFinishTime());
        lineShowDO.setGate(lineShowVO.getGate());
        lineShowDO.setMiddleAirport(lineShowVO.getMiddleAirport());
        lineShowDO.setMiddleCity(lineShowVO.getMiddleCity());
        lineShowDO.setMiddleTime(lineShowVO.getMiddleTime());
        lineShowDO.setTaxMoney(lineShowVO.getTaxMoney());
        lineShowDO.setStartAirport(lineShowVO.getStartAirport());
        lineShowDO.setStartTime(lineShowVO.getStartTime());
        return lineShowDO;
    }


    /**
     * 舱位DO转VO
     * @param stockDO
     * @return
     * @throws GoodsException
     */
    public static StockVO stockDO2stockVO(StockDO stockDO) throws GoodsException{
        if (stockDO == null)
            throw new GoodsException("stockDO is null");
        StockVO stockVO=new StockVO();
        stockVO.setBerthLast(stockDO.getBerthLast());
        stockVO.setBerthName(stockDO.getBerthName());
        stockVO.setBerthNumber(stockDO.getBerthNumber());
        stockVO.setBerthPrice(stockDO.getBerthPrice());
        stockVO.setBerthSum(stockDO.getBerthSum());
        stockVO.setBerthType(stockDO.getBerthType());
        stockVO.setDiscount(stockDO.getDiscount());
        stockVO.setFlightID(stockDO.getFlightID());
        stockVO.setLineID(stockDO.getLineID());
        stockVO.setMaxSale(stockDO.getMaxSale());
        stockVO.setMealExist(stockDO.getMealExist());
        stockVO.setRebate(stockDO.getRebate());
        stockVO.setStockID(stockDO.getStockID());
        return stockVO;
    }


    /**
     * 舱位VO转DO
     * @param stockVO
     * @return
     * @throws GoodsException
     */
    public static StockDO stockVO2stockDO(StockVO stockVO) throws GoodsException{
        if (stockVO == null)
            throw new GoodsException("stockVO is null");
        StockDO stockDO=new StockDO();
        stockDO.setBerthLast(stockVO.getBerthLast());
        stockDO.setBerthName(stockVO.getBerthName());
        stockDO.setBerthNumber(stockVO.getBerthNumber());
        stockDO.setBerthPrice(stockVO.getBerthPrice());
        stockDO.setBerthSum(stockVO.getBerthSum());
        stockDO.setBerthType(stockVO.getBerthType());
        stockDO.setDiscount(stockVO.getDiscount());
        stockDO.setFlightID(stockVO.getFlightID());
        stockDO.setLineID(stockVO.getLineID());
        stockDO.setMaxSale(stockVO.getMaxSale());
        stockDO.setMealExist(stockVO.getMealExist());
        stockDO.setRebate(stockVO.getRebate());
        stockDO.setStockID(stockVO.getStockID());
        return stockDO;
    }
}
