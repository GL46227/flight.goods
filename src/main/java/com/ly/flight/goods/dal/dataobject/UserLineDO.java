/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.dataobject;

import java.util.Date;

/**
 * @author gl46227
 * @version $Id: UserLineDO.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class UserLineDO {
    private String startCity;
    private String finishCity;
    private Date startDate;

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
}
