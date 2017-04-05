/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.dataobject;

/**
 * @author gl46227
 * @version $Id: flightDO.java, v0.1 2017/4/1 gl46227 Exp $$
 */
public class FlightDO {
    /**
     * 航司名称
     */
    private String flightID;
    /**
     * 航司名称
     */
    private String flightName;
    /**
     * 飞机类型
     */
    private String planeType;

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }
}
