/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.dataobject;

import java.math.BigDecimal;

/**
 * @author gl46227
 * @version $Id: StockDO.java, v0.1 2017/4/1 gl46227 Exp $$
 */
public class StockDO {
    /**
     * 舱位ID
     */
    private String stockID;
    /**
     * 航司ID
     */
    private String flightID;
    /**
     * 航程ID
     */
    private String lineID;
    /**
     * 舱位类型
     */
    private String berthType;
    /**
     * 舱位名称
     */
    private String berthName;
    /**
     * 座位舱号
     */
    private String berthNumber;
    /**
     * 座位总数
     */
    private int berthSum;
    /**
     * 座位库存剩余
     */
    private int berthLast;
    /**
     * 最大售卖量
     */
    private int maxSale;
    /**
     * 已下单量
     */
    private int isSale;
    /**
     * 机票价格
     */
    private BigDecimal berthPrice;
    /**
     * 折扣
     */
    private BigDecimal discount;
    /**
     * 返利金额
     */
    private BigDecimal rebate;
    /**
     * 餐食有无
     */
    private int mealExist;

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public String getBerthType() {
        return berthType;
    }

    public void setBerthType(String berthType) {
        this.berthType = berthType;
    }

    public String getBerthName() {
        return berthName;
    }

    public void setBerthName(String berthName) {
        this.berthName = berthName;
    }

    public String getBerthNumber() {
        return berthNumber;
    }

    public void setBerthNumber(String berthNumber) {
        this.berthNumber = berthNumber;
    }

    public int getBerthSum() {
        return berthSum;
    }

    public void setBerthSum(int berthSum) {
        this.berthSum = berthSum;
    }

    public int getBerthLast() {
        return berthLast;
    }

    public void setBerthLast(int berthLast) {
        this.berthLast = berthLast;
    }

    public int getMaxSale() {
        return maxSale;
    }

    public void setMaxSale(int maxSale) {
        this.maxSale = maxSale;
    }

    public BigDecimal getBerthPrice() {
        return berthPrice;
    }

    public void setBerthPrice(BigDecimal berthPrice) {
        this.berthPrice = berthPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public int getMealExist() {
        return mealExist;
    }

    public void setMealExist(int mealExist) {
        this.mealExist = mealExist;
    }

    public int getIsSale() {
        return isSale;
    }

    public void setIsSale(int isSale) {
        this.isSale = isSale;
    }
}
