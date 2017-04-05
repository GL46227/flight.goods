/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ly.flight.goods.biz.serviceImpl;

import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.StockVO;
import com.ly.flight.goods.biz.mapper.GoodsMapper;
import com.ly.flight.goods.biz.service.StockService;
import com.ly.flight.goods.dal.dalinterface.StockMapper;
import com.ly.flight.goods.dal.dataobject.StockDO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: StockServiceImpl.java, v0.1 2017/4/5 gl46227 Exp $$
 */
public class StockServiceImpl implements StockService {

    @Resource
    private StockMapper stockMapper;

    public Integer addStock(StockVO stockVO) throws GoodsException {
        return stockMapper.insertStock(GoodsMapper.stockVO2stockDO(stockVO));
    }

    public Integer removeStock(String stockID) throws GoodsException {
        return stockMapper.deleteStock(stockID);
    }

    public Integer updateStock(StockVO stockVO) throws GoodsException {
        return stockMapper.updateStock(GoodsMapper.stockVO2stockDO(stockVO));
    }

    public List<StockVO> getAllStocks() throws GoodsException {
        List<StockVO> listVO=new ArrayList<StockVO>();
        List<StockDO> list=stockMapper.selectStocks();
        for (StockDO stockDO:list
             ) {
            StockVO stockVO=GoodsMapper.stockDO2stockVO(stockDO);
            listVO.add(stockVO);
        }
         return listVO;
    }

    public StockVO getStock(String stockID) throws GoodsException {
        return GoodsMapper.stockDO2stockVO(stockMapper.selectStock(stockID));
    }

    public List<StockVO> getStockByLineID(String lineID) throws GoodsException {
       List<StockDO> list=stockMapper.selectStockByLineID(lineID);
        List<StockVO> listVO=new ArrayList<StockVO>();
        for (StockDO stockDO:list
             ) {
            StockVO stockVO=GoodsMapper.stockDO2stockVO(stockDO);
            listVO.add(stockVO);
        }
        return listVO;
    }

    public List<StockVO> getStockByFlightID(String flightID) throws GoodsException {
        List<StockDO> list=stockMapper.selectStockByFlightID(flightID);
        List<StockVO> listVO=new ArrayList<StockVO>();
        for (StockDO stockDO:list
             ) {
            StockVO stockVO=GoodsMapper.stockDO2stockVO(stockDO);
            listVO.add(stockVO);
        }
        return listVO;
    }
}
