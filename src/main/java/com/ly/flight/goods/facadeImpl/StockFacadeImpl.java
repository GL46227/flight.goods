/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.flight.core.goods.DTO.StockDTO;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.core.goods.SingleResult;
import com.ly.flight.core.goods.facade.StockFacade;
import com.ly.flight.goods.biz.VO.StockVO;
import com.ly.flight.goods.biz.enums.CommonStatus;
import com.ly.flight.goods.biz.mapper.BaseMapper;
import com.ly.flight.goods.biz.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: StockFacadeImpl.java, v0.1 2017/4/7 gl46227 Exp $$
 */
@Service
public class StockFacadeImpl implements StockFacade{
    private final static Logger logger = LoggerFactory.getLogger(StockFacadeImpl.class);
    @Resource
    private StockService stockService;
    public SingleResult<String> addStock(StockDTO stockDTO) {
        Assert.notNull(stockDTO,"stockDTO cant be null");
        try {
            Integer integer = stockService.addStock(BaseMapper.stockDTO2VO(stockDTO));
             if (integer==1)
                 return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        } catch (GoodsException e) {
            logger.error("addStock happens some UnKnow error");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),"UNKNOW");
        }

    }

    public SingleResult<String> removeStock(String s) {
        try {
            if (stockService.removeStock(s)==1)
                return new SingleResult<String>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),"SUCCESS");
            return new SingleResult<String>(CommonStatus.FAIL.getCode(),CommonStatus.FAIL.getMsg(),"FAIL");
        } catch (GoodsException e) {
            logger.error("RemoveStock happens some UnKnow error");
            return new SingleResult<String>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),"UNKNOW");
        }
    }

    public SingleResult<Integer> updateStock(StockDTO stockDTO) {
        Assert.notNull(stockDTO,"stockDTO cant be null");
        try {
            Integer result=stockService.updateStock(BaseMapper.stockDTO2VO(stockDTO));
            return new SingleResult<Integer>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),result);
        } catch (GoodsException e) {
            logger.error("updateStock happens some UnKnow error");
            return new SingleResult<Integer>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<List<StockDTO>> getAllStock() {
        try {
            List<StockVO> listVO=stockService.getAllStocks();
            List<StockDTO> listDTO=new ArrayList<StockDTO>();
            for (StockVO stockVO:listVO
                 ) {
                StockDTO stockDTO=BaseMapper.stockVO2DTO(stockVO);
                listDTO.add(stockDTO);
            }
            return new SingleResult<List<StockDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),listDTO);
        } catch (GoodsException e) {
            logger.error("GetAllStocks happens some UnKnow error");
            return new SingleResult<List<StockDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<StockDTO> getStock(String s) {
        try {
            StockDTO stockDTO=BaseMapper.stockVO2DTO(stockService.getStock(s));
            return new SingleResult<StockDTO>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),stockDTO);
        } catch (GoodsException e) {
            logger.error("GetStock happens some UnKnow error");
            return new SingleResult<StockDTO>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<List<StockDTO>> getStockByLineID(String s) {
        try {
            List<StockVO> listVO=stockService.getStockByLineID(s);
            List<StockDTO> listDTO=new ArrayList<StockDTO>();
            for (StockVO stockVO:listVO
                 ) {
                StockDTO stockDTO=BaseMapper.stockVO2DTO(stockVO);
                listDTO.add(stockDTO);
            }
            return new SingleResult<List<StockDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),listDTO);
        } catch (GoodsException e) {
            logger.error("GetStockByLineID happens some UnKnow error");
            return new SingleResult<List<StockDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
    }

    public SingleResult<List<StockDTO>> getStockByFlightID(String s) {
        try {
            List<StockVO> listVO=stockService.getStockByFlightID(s);
            List<StockDTO> listDTO=new ArrayList<StockDTO>();
            for (StockVO stockVO:listVO
                 ) {
                StockDTO stockDTO=BaseMapper.stockVO2DTO(stockVO);
                listDTO.add(stockDTO);
            }
            return new SingleResult<List<StockDTO>>(CommonStatus.SUCCESS.getCode(),CommonStatus.SUCCESS.getMsg(),listDTO);
        } catch (GoodsException e) {
            logger.error("GetStockByFlightID happens some UnKnow error");
            return new SingleResult<List<StockDTO>>(CommonStatus.UNKNOW.getCode(),CommonStatus.UNKNOW.getMsg(),null);
        }
        }
    }

