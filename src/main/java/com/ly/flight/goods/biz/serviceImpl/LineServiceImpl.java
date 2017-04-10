/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.serviceImpl;

import com.ly.flight.core.goods.DTO.UserLineDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.VO.LineVO;
import com.ly.flight.goods.biz.mapper.BaseMapper;
import com.ly.flight.goods.biz.mapper.GoodsMapper;
import com.ly.flight.goods.biz.service.LineService;
import com.ly.flight.goods.dal.daointerface.FlightMapper;
import com.ly.flight.goods.dal.daointerface.LineMapper;
import com.ly.flight.goods.dal.daointerface.StockMapper;
import com.ly.flight.goods.dal.dataobject.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.ly.flight.goods.biz.mapper.GoodsMapper.lineShowDO2lineShowVO;
import static javafx.scene.input.KeyCode.F;
import static javafx.scene.input.KeyCode.L;

/**
 * @author gl46227
 * @version $Id: LineServiceImpl.java, v0.1 2017/4/5 gl46227 Exp $$
 */
@Service("lineService")
public class LineServiceImpl implements LineService {
    private static final Logger logger = LoggerFactory.getLogger(FlightServiceImpl.class);
    @Autowired
    private LineMapper lineMapper;

    @Autowired
    private FlightMapper flightMapper;

    @Autowired
    private StockMapper stockMapper;

    public Integer addLine(LineVO lineVO) throws GoodsException {
        return lineMapper.insertLine(GoodsMapper.lineVO2lineDO(lineVO));
    }

    public Integer removeLine(String lineID) throws GoodsException {
        return lineMapper.deleteLine(lineID);
    }

    public Integer updateLine(LineVO lineVO) throws GoodsException {
        return lineMapper.updateLine(GoodsMapper.lineVO2lineDO(lineVO));
    }

    public List<LineVO> getAllLines() throws GoodsException {
        List<LineVO> listVO = new ArrayList<LineVO>();
        List<LineDO> list = lineMapper.selectAllLines();
        for (LineDO lineDO : list
                ) {
            LineVO lineVO = GoodsMapper.lineDO2lineVO(lineDO);
            listVO.add(lineVO);
        }
        return listVO;
    }

    public LineVO getLineByLineID(String lineID) throws GoodsException {
        return GoodsMapper.lineDO2lineVO(lineMapper.selectLine(lineID));
    }

    public List<LineVO> getLineByFlightID(String flightID) throws GoodsException {
        List<LineVO> listVO = new ArrayList<LineVO>();
        List<LineDO> list = lineMapper.selectLinesByFlightID(flightID);
        for (LineDO lineDO : list
                ) {
            LineVO lineVO = GoodsMapper.lineDO2lineVO(lineDO);
            listVO.add(lineVO);
        }
        return listVO;
    }

//    public List<LineShowVO> getLineByUserDTO(UserLineDTO userLineDTO) throws GoodsException {
//        UserLineDO userLineDO = GoodsMapper.userLineDTO2UserLineDO(userLineDTO);
//        List<LineShowVO> listVO = new ArrayList<LineShowVO>();
//        List<LineShowDO> list = lineMapper.selectLinesByUser(userLineDO);
//        for (LineShowDO lineShowDO : list
//                ) {
//            LineShowVO lineShowVO = lineShowDO2lineShowVO(lineShowDO);
//            listVO.add(lineShowVO);
//        }
//        return listVO;
//    }


    public List<LineShowVO> getLinesByUser(UserLineDTO userLineDTO) throws GoodsException {
        List<LineDO> lineDOList=lineMapper.selectLinesByUserDTO(GoodsMapper.userLineDTO2UserLineDO(userLineDTO));
        List<LineShowDO> lineShowDOlist=new ArrayList();
        //FlightDO flight=flightMapper.selectFlight(flightID);
        for (LineDO lineDO:lineDOList
             ) {
            LineShowDO lineShowDO=new LineShowDO();
            lineShowDO.setLineID(lineDO.getLineID());
            lineShowDO.setStartDate(lineDO.getStartDate());
            lineShowDO.setStartCity(lineDO.getStartCity());
            lineShowDO.setFinishCity(lineDO.getFinishCity());
            lineShowDO.setFinishAirport(lineDO.getFinishAirport());
            lineShowDO.setFlightDO(flightMapper.selectFlight(lineDO.getFlightID()));
            lineShowDO.setFinishTime(lineDO.getFinishTime());
            lineShowDO.setGate(lineDO.getGate());
            lineShowDO.setMiddleAirport(lineDO.getMiddleAirport());
            lineShowDO.setMiddleCity(lineDO.getMiddleCity());
            lineShowDO.setMiddleTime(lineDO.getMiddleTime());
            lineShowDO.setTaxMoney(lineDO.getTaxMoney());
            lineShowDO.setStartAirport(lineDO.getStartAirport());
            lineShowDO.setStartTime(lineDO.getStartTime());
            List<StockDO> stockDOlist=stockMapper.selectStockByFlightID(lineDO.getFlightID());
            lineShowDO.setStockDOList(stockDOlist);
            lineShowDOlist.add(lineShowDO);
        }
        List<LineShowVO> lineShowVOlist=new ArrayList<LineShowVO>();
        for (LineShowDO lineShowDO:lineShowDOlist
             ) {
           LineShowVO lineShowVO=GoodsMapper.lineShowDO2lineShowVO(lineShowDO);
            lineShowVOlist.add(lineShowVO);
        }
        return lineShowVOlist;
    }
}
