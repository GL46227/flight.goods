/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.facadeImpl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.ly.flight.core.goods.DTO.LineDTO;
import com.ly.flight.core.goods.DTO.LineShowDTO;
import com.ly.flight.core.goods.DTO.UserLineDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.core.goods.SingleResult;
import com.ly.flight.core.goods.facade.LineFacade;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.VO.LineVO;
import com.ly.flight.goods.biz.enums.CommonStatus;
import com.ly.flight.goods.biz.mapper.GoodsMapper;
import com.ly.flight.goods.biz.service.LineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: LineFacadeImpl.java, v0.1 2017/4/6 gl46227 Exp $$
 */
@Service
public class LineFacadeImpl implements LineFacade{
    private final static Logger logger = LoggerFactory.getLogger(LineFacadeImpl.class);
    @Resource
    private LineService lineService;
    public SingleResult<String> addLine(LineDTO lineDTO) {
        Assert.notNull(lineDTO, "lineDTO must not null");
        try {
            LineVO lineVO= GoodsMapper.lineDTO2VO(lineDTO);
            if (lineService.addLine(lineVO)==1)
                return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        } catch (GoodsException e) {
            logger.error("Add Line happens unKnow error!");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),"UNKNOW");
        }
    }

    public SingleResult<String> removeLine(String s) {
        Assert.isTrue(StringUtils.isBlank(s),"LineID cant be null");
        try {
            Integer result=lineService.removeLine(s);
            if (result==1)
                return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        } catch (GoodsException e) {
            logger.error("Remove Line happens unKnow error!");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),"UNKNOW");
        }
    }

    public SingleResult<Integer> updateLine(LineDTO lineDTO) {
        Assert.notNull(lineDTO,"LineDTO cant be null");
        try {
            LineVO lineVO=GoodsMapper.lineDTO2VO(lineDTO);
            Integer result=lineService.updateLine(lineVO);
            return new SingleResult<Integer>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),result);
        } catch (GoodsException e) {
            logger.error("Update Line happens unKnow error!");
            return new SingleResult<Integer>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }


    public SingleResult<List<LineDTO>> getAllLines() {
        List<LineDTO> lineDTOList=new ArrayList<LineDTO>();
        try {
            List<LineVO> lineVOList=lineService.getAllLines();
            for (LineVO lineVO:lineVOList
                 ) {
                LineDTO lineDTO=GoodsMapper.lineVO2DTO(lineVO);
                lineDTOList.add(lineDTO);
            }
            return new SingleResult<List<LineDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),lineDTOList);
        } catch (GoodsException e) {
            logger.error("GetAllLines  happens unKnow error!");
            return new SingleResult<List<LineDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<LineDTO> getLineByLineID(String s) {
        Assert.isTrue(StringUtils.isBlank(s),"LineID cant be null");
        try {
            LineVO lineVO=lineService.getLineByLineID(s);
            LineDTO lineDTO=GoodsMapper.lineVO2DTO(lineVO);
            return new SingleResult<LineDTO>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),lineDTO);
        } catch (GoodsException e) {
            logger.error("GetLineByLineID  happens unKnow error!");
            return new SingleResult<LineDTO>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<List<LineDTO>> getLineByFlightID(String s) {
        Assert.isTrue(StringUtils.isBlank(s),"FlightID cant be null");
        try {
          List<LineVO> listVO=lineService.getLineByFlightID(s);
            List<LineDTO> listDTO=new ArrayList<LineDTO>();
            for (LineVO lineVO:listVO
                 ) {
                LineDTO lineDTO=GoodsMapper.lineVO2DTO(lineVO);
                listDTO.add(lineDTO);
            }
            return new SingleResult<List<LineDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),listDTO);
        } catch (GoodsException e) {
            logger.error("GetLineByFlightID  happens unKnow error!");
            return new SingleResult<List<LineDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<List<LineShowDTO>> getLineByUserDTO(UserLineDTO userLineDTO) {
        Assert.notNull(userLineDTO,"UserLineDTO cant be null");
        try {
           List<LineShowVO> listVO= lineService.getLineByUserDTO(userLineDTO);
            List<LineShowDTO> listDTO=new ArrayList<LineShowDTO>();
            for (LineShowVO lineShowVO:listVO
                 ) {
                LineShowDTO lineShowDTO=GoodsMapper.lineShowVO2lineShowDTO(lineShowVO);
                listDTO.add(lineShowDTO);
            }
            return new SingleResult<List<LineShowDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),listDTO);
        } catch (GoodsException e) {
            logger.error("getLineByUserDTO  happens unKnow error!");
            return new SingleResult<List<LineShowDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }
}
