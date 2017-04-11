/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

import com.alibaba.dubbo.common.json.JSONArray;
import com.ly.flight.core.goods.GoodsException;
import com.ly.flight.goods.biz.VO.LineShowVO;
import com.ly.flight.goods.biz.mapper.GoodsMapper;
import com.ly.flight.goods.biz.service.FlightService;
import com.ly.flight.goods.biz.service.LineService;
import com.ly.flight.goods.biz.service.StockService;
import com.ly.flight.goods.dal.daointerface.LineMapper;
import com.ly.flight.goods.dal.dataobject.LineDO;
import com.ly.flight.goods.dal.dataobject.UserLineDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author gl46227
 * @version $Id: gl.java, v0.1 2017/4/9 gl46227 Exp $$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/*"})
//@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
//@Transactional
public class gl {
//    @Resource
//    private FlightMapper flightMapper;
    @Resource
    private LineMapper lineMapper;
//    @Resource
//    private StockMapper stockMapper;
    @Resource
    private FlightService flightService;
    @Resource
    private LineService lineService;
    @Resource
    private StockService stockService;

        @Test
        public  void test() throws GoodsException, ParseException {

//
            String str = "2017-04-010T16:00:00.000Z";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date=format.parse(str);
            UserLineDO userLineDO=new UserLineDO();
            userLineDO.setStartCity("北京");
            userLineDO.setFinishCity("南京");
            userLineDO.setStartDate(date);
            List<LineShowVO> list= lineService.getLinesByUser(GoodsMapper.userLineDO2UserLineDTO(userLineDO));
//            LineVO lineVO=  lineService.getLineByUserDTO();
//            System.out.println(lineVO.getLineID());
//            lineService.updateLine();
//               List<FlightVO> list=flightService.getAllFlights();
//             System.out.println(list.get(0).getFlightID());
//            FlightDO flightDO=new FlightDO();
//            flightDO.setFlightID("f7");
//            flightDO.setFlightName("中国国际航空");
//            flightDO.setPlaneType("321中");
//            FlightVO flightVO= BaseMapper.flightDO2flightVO(flightDO);
//           int i= flightService.addFlight(flightVO);
//            System.out.println(i);

        // int i=flightMapper.deleteFlight("f1");

//            LineDO lineDO=new LineDO();
//            lineDO.setFinishCity("南京");
//            String str = "2017-04-10";
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//            Date date=format.parse(str);
//            lineDO.setStartTime(date);
//            lineDO.setFlightID("f1");
//            lineDO.setStartAirport("sdf");
//            lineDO.setTaxMoney(new BigDecimal(55));
//            lineDO.setFinishTime(date);
//            lineDO.setFinishAirport("ef");
//            lineDO.setGate("45");
//            lineDO.setLineID("l9");
//            lineDO.setStartAirport("wef");
//            lineDO.setStartCity("fsd");
//            lineDO.setStartDate(date);
//           int i =lineService.addLine(GoodsMapper.lineDO2lineVO(lineDO));
//            System.out.println(i);

//            lineMapper.deleteLine("l1");

//            int i=stockMapper.deleteStock("s1");





    }


}
