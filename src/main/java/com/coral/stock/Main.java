package com.coral.stock;

import com.coral.stock.dao.StockModelDao;
import com.coral.stock.model.StockModel;
import com.coral.stock.utils.DateUtils;
import com.coral.stock.utils.HttpConnectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by ccc on 2017/6/23.
 */
public class Main {

    StockModelDao stockModelDao;

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
        main.getShanghaiStock();
        main.getShengZhengStock();
    }

    public void init() {
        String paths[] = { "META-INF/applicationContext.xml" };
        //这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        stockModelDao = (StockModelDao) ctx.getBean(StockModelDao.SPRING_BEAN_NAME);
        System.out.println("Init Stock App done.");
    }

    public void getShanghaiStock() {
        for(int i=1;i<999;i++) {
            invokeSinaAPI("http://hq.sinajs.cn/list=sh600"+ i);
        }
    }

    public void getShengZhengStock() {
        for(int i=1;i<999;i++) {
            invokeSinaAPI("http://hq.sinajs.cn/list=sz000"+ i);
            invokeSinaAPI("http://hq.sinajs.cn/list=sz300"+ i);
        }
    }

    private void invokeSinaAPI(String url) {
        String rs = HttpConnectionUtils.httpGet(url);
        System.out.println(url + ", data= " + rs);
        String txt = rs.substring((rs.indexOf("\"")+1), (rs.length() -3));
        String[] data = txt.split(",");
        if(data.length > 2) {
            saveStock(data);
        }
    }

    public void saveStock(String[] data) {
        StockModel sm = new StockModel();
        sm.setStockName(data[0]);
        sm.setOpenPrice(data[1]);
        sm.setYesterdayClosePrice(data[2]);
        sm.setTodayPrice(data[3]);
        sm.setTodayHighestPrice(data[4]);
        sm.setTodayLowestPrice(data[5]);
        sm.setDealStokeNumber(data[8]);
        sm.setDealStokeTotalAmount(data[9]);
        sm.setBuyOneNumber(new BigDecimal(data[10]));
        sm.setBuyOnePrice(new BigDecimal(data[11]));
        sm.setBuyTwoNumber(new BigDecimal(data[12]));
        sm.setBuyTwoPrice(new BigDecimal(data[13]));
        sm.setBuyThreeNumber(new BigDecimal(data[14]));
        sm.setBuyThreePrice(new BigDecimal(data[15]));
        sm.setBuyFourNumber(new BigDecimal(data[16]));
        sm.setBuyFourPrice(new BigDecimal(data[17]));
        sm.setBuyFiveNumber(new BigDecimal(data[18]));
        sm.setBuyFivePrice(new BigDecimal(data[19]));
        sm.setSellOneNumber(new BigDecimal(data[20]));
        sm.setSellOnePrice(new BigDecimal(data[21]));
        sm.setSellTwoNumber(new BigDecimal(data[22]));
        sm.setSellTwoPrice(new BigDecimal(data[23]));
        sm.setSellThreeNumber(new BigDecimal(data[24]));
        sm.setSellThreePrice(new BigDecimal(data[25]));
        sm.setSellFourNumber(new BigDecimal(data[26]));
        sm.setSellFourPrice(new BigDecimal(data[27]));
        sm.setSellFiveNumber(new BigDecimal(data[28]));
        sm.setSellFivePrice(new BigDecimal(data[29]));
        sm.setCreateDate(DateUtils.toDate(data[30]));
        sm.setCreateTime(data[31]);
        stockModelDao.save(sm);
    }
}
