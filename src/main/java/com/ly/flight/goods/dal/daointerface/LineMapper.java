/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.dal.daointerface;


import com.ly.flight.goods.dal.dataobject.LineDO;
import com.ly.flight.goods.dal.dataobject.LineShowDO;
import com.ly.flight.goods.dal.dataobject.UserLineDO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: LineMapper.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface LineMapper {

    /**
     * 插入一个航程的信息
     * @param line
     * @return
     */
    int insertLine(LineDO line);

    /**
     * 根据航程ID删除一条航程信息
     * @param lineID
     * @return
     */
    int deleteLine(String lineID);

    /**
     * 更新一条航程的信息
     * @param lineDO
     * @return
     */
    int updateLine(LineDO lineDO);

    /**
     * 加载所有航程信息
     * @return
     */
    List<LineDO> selectAllLines();

    /**
     * 根据航程ID查询航程信息
     * @param lineID
     * @return
     */
   LineDO selectLine(String lineID);

    /**
     * 根据航司ID查询航程信息
     * @param flightID
     * @return
     */
    List<LineDO> selectLinesByFlightID(String flightID);

    /**
     * 用户查询
     * @param userLineDO
     * @return
     */
    List<LineShowDO> selectLinesByUser(UserLineDO userLineDO);

    /**
     * 用户查询
     * @param userLineDTO
     * @return
     */
    List<LineDO> selectLinesByUserDTO(UserLineDO userLineDTO);
}
