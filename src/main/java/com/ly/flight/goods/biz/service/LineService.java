/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.service;

import com.ly.flight.core.goods.DTO.UserLineDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.VO.LineVO;

import java.util.List;

/**
 * @author gl46227
 * @version $Id: LineService.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public interface LineService {
    /**
     * 增加一条航程信息
     * @param lineVO
     * @return
     */
    Integer addLine(LineVO lineVO) throws GoodsException;

    /**
     * 删除一条航程信息
     * @param lineID
     * @return
     */
    Integer removeLine(String lineID) throws GoodsException;

    /**
     * 更改航程信息
     * @param lineVO
     * @return
     */
    Integer updateLine(LineVO lineVO) throws GoodsException;

    /**
     * 获取所有的航程的信息
     * @return
     */
    List<LineVO> getAllLines() throws GoodsException;

    /**
     * 根据航程ID获取航程信息
     * @param lineID
     * @return
     * @throws GoodsException
     */
    LineVO getLineByLineID(String lineID) throws GoodsException;

    /**
     * 根据航程ID获取航程信息
     * @param flightID
     * @return
     * @throws GoodsException
     */
    List<LineVO> getLineByFlightID(String flightID) throws GoodsException;

    /**
     * 根据用户DTO查询
     * @param userLineDTO
     * @return
     * @throws GoodsException
     */
    List<LineShowVO> getLineByUserDTO(UserLineDTO userLineDTO) throws GoodsException;

}
