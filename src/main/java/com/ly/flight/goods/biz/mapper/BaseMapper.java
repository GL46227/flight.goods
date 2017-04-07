/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.mapper;

import com.ly.flight.core.goods.DTO.FlightDTO;
import com.ly.flight.core.goods.DTO.StockDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.FlightVO;
import com.ly.flight.goods.biz.VO.StockVO;
import com.ly.flight.goods.dal.dataobject.FlightDO;
import com.ly.flight.goods.dal.dataobject.StockDO;

/**
 * @author gl46227
 * @version $Id: FlightMapper.java, v0.1 2017/4/6 gl46227 Exp $$
 */
public class BaseMapper {

    /**
     * 航司DTO转VO
     *
     * @param flightDTO
     * @return
     * @throws GoodsException
     */
    public static FlightVO flightDTO2VO(FlightDTO flightDTO) throws GoodsException {
        if (flightDTO == null)
            throw new GoodsException("flightDTO is null");
        FlightVO flightVO = new FlightVO();
        flightVO.setFlightID(flightDTO.getFlightID());
        flightVO.setFlightName(flightDTO.getFlightName());
        flightVO.setPlaneType(flightDTO.getPlaneType());
        return flightVO;
    }


    /**
     * 航司VO转DTO
     *
     * @param flightVO
     * @return
     * @throws GoodsException
     */
    public static FlightDTO flightVO2DTO(FlightVO flightVO) throws GoodsException {
        if (flightVO == null)
            throw new GoodsException("flightVO is null");
        FlightDTO flightDTO = new FlightDTO();
        flightDTO.setFlightID(flightVO.getFlightID());
        flightDTO.setFlightName(flightVO.getFlightName());
        flightDTO.setPlaneType(flightVO.getPlaneType());
        return flightDTO;
    }




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
     * 舱位DO转VO
     *
     * @param stockDO
     * @return
     * @throws GoodsException
     */
    public static StockVO stockDO2stockVO(StockDO stockDO) throws GoodsException {
        if (stockDO == null)
            throw new GoodsException("stockDO is null");
        StockVO stockVO = new StockVO();
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
     *
     * @param stockVO
     * @return
     * @throws GoodsException
     */
    public static StockDO stockVO2stockDO(StockVO stockVO) throws GoodsException {
        if (stockVO == null)
            throw new GoodsException("stockVO is null");
        StockDO stockDO = new StockDO();
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


    /**
     * 舱位VO转DTO
     * @param stockVO
     * @return
     * @throws GoodsException
     */
    public static StockDTO stockVO2DTO(StockVO stockVO) throws GoodsException{
        if (stockVO==null)
            throw new GoodsException("stockVO is null");
        StockDTO stockDTO=new StockDTO();
        stockDTO.setStockID(stockVO.getStockID());
        stockDTO.setRebate(stockVO.getRebate());
        stockDTO.setBerthLast(stockVO.getBerthLast());
        stockDTO.setBerthName(stockVO.getBerthName());
        stockDTO.setBerthNumber(stockVO.getBerthNumber());
        stockDTO.setBerthPrice(stockVO.getBerthPrice());
        stockDTO.setBerthSum(stockVO.getBerthSum());
        stockDTO.setBerthType(stockVO.getBerthType());
        stockDTO.setDiscount(stockVO.getDiscount());
        stockDTO.setFlightID(stockVO.getFlightID());
        stockDTO.setLineID(stockVO.getLineID());
        stockDTO.setMaxSale(stockVO.getMaxSale());
        stockDTO.setMealExist(stockVO.getMealExist());
        return stockDTO;
    }

    /**
     * 舱位DTO转VO
     * @param stockDTO
     * @return
     * @throws GoodsException
     */
    public static StockVO stockDTO2VO(StockDTO stockDTO) throws GoodsException{
        if (stockDTO==null)
            throw new GoodsException("stockVO is null");
        StockVO stockVO=new StockVO();
        stockVO.setStockID(stockDTO.getStockID());
        stockVO.setRebate(stockDTO.getRebate());
        stockVO.setBerthLast(stockDTO.getBerthLast());
        stockVO.setBerthName(stockDTO.getBerthName());
        stockVO.setBerthNumber(stockDTO.getBerthNumber());
        stockVO.setBerthPrice(stockDTO.getBerthPrice());
        stockVO.setBerthSum(stockDTO.getBerthSum());
        stockVO.setBerthType(stockDTO.getBerthType());
        stockVO.setDiscount(stockDTO.getDiscount());
        stockVO.setFlightID(stockDTO.getFlightID());
        stockVO.setLineID(stockDTO.getLineID());
        stockVO.setMaxSale(stockDTO.getMaxSale());
        stockVO.setMealExist(stockDTO.getMealExist());
        return stockVO;
    }


}
