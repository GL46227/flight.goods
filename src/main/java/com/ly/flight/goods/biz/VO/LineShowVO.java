/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.VO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: LineShowVO.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class LineShowVO {
    /**
     * 航程ID   db_column：LINE_ID
     */
    private String lineID;

    /**
     * 起飞城市   db_column：START_CITY
     */
    private String startCity;

    /**
     * 终点城市   db_column：FINISH_CITY
     */
    private String finishCity;

    /**
     * 起飞日期
     */
    private Date startDate;

    /**
     * 起飞时间   db_column：GMT_START
     */
    private Date startTime;

    /**
     * 到达时间   db_column：GMT_FINISH
     */
    private Date finishTime;

    /**
     * 起飞机场   db_column：START_AIRPORT
     */
    private String startAirport;

    /**
     * 终点机场   db_column：FINISH_AIRPORT
     */
    private String finishAirport;

    /**
     * 经停机场   db_column：MIDDLE_AIRPORT
     */
    private String middleAirport;

    /**
     * 经停城市  db_column：MIDDLE_CITY
     */
    private String middleCity;

    /**
     * 经停时间  db_column：GMT_MIDDLE
     */
    private  String middleTime;

    /**
     * 航司
     */
    private FlightVO flightVO;


    /**
     * 登机口   db_column：GATE
     */
    private String gate;

    /**
     * 税费   db_column：TAX_MONEY
     */
    private BigDecimal taxMoney;
    /**
     * 舱位表
     */
    private List<StockVO> stockVOList;

    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getFinishCity() {
        return finishCity;
    }

    public void setFinishCity(String finishCity) {
        this.finishCity = finishCity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getStartAirport() {
        return startAirport;
    }

    public void setStartAirport(String startAirport) {
        this.startAirport = startAirport;
    }

    public String getFinishAirport() {
        return finishAirport;
    }

    public void setFinishAirport(String finishAirport) {
        this.finishAirport = finishAirport;
    }

    public String getMiddleAirport() {
        return middleAirport;
    }

    public void setMiddleAirport(String middleAirport) {
        this.middleAirport = middleAirport;
    }

    public String getMiddleCity() {
        return middleCity;
    }

    public void setMiddleCity(String middleCity) {
        this.middleCity = middleCity;
    }

    public String getMiddleTime() {
        return middleTime;
    }

    public void setMiddleTime(String middleTime) {
        this.middleTime = middleTime;
    }

    public FlightVO getFlightVO() {
        return flightVO;
    }

    public void setFlightVO(FlightVO flightVO) {
        this.flightVO = flightVO;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    public List<StockVO> getStockVOList() {
        return stockVOList;
    }

    public void setStockVOList(List<StockVO> stockVOList) {
        this.stockVOList = stockVOList;
    }
}
