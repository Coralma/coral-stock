package com.coral.stock.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 0：”大秦铁路”，股票名字；
 1：”27.55″，今日开盘价；
 2：”27.25″，昨日收盘价；
 3：”26.91″，当前价格；
 4：”27.55″，今日最高价；
 5：”26.20″，今日最低价；
 6：”26.91″，竞买价，即“买一”报价；
 7：”26.92″，竞卖价，即“卖一”报价；
 8：”22114263″，成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
 9：”589824680″，成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
 10：”4695″，“买一”申请4695股，即47手；
 11：”26.91″，“买一”报价；
 12：”57590″，“买二”
 13：”26.90″，“买二”
 14：”14700″，“买三”
 15：”26.89″，“买三”
 16：”14300″，“买四”
 17：”26.88″，“买四”
 18：”15100″，“买五”
 19：”26.87″，“买五”
 20：”3100″，“卖一”申报3100股，即31手；
 21：”26.92″，“卖一”报价
 (22, 23), (24, 25), (26,27), (28, 29)分别为“卖二”至“卖四的情况”
 30：”2008-01-11″，日期；
 31：”15:05:32″，时间；
 * Created by Coral on 2017/6/23.
 */
@Document(collection="StockModel")
public class StockModel {
    //基本属性
    private String stockName; //股票名字
    private BigDecimal openPrice;//今日开盘价
    private BigDecimal yesterdayClosePrice;//昨日收盘价
    private BigDecimal todayPrice;//当前价格
    private BigDecimal todayHighestPrice;//今日最高价
    private BigDecimal todayLowestPrice;//今日最低价
    private BigDecimal dealStokeNumber;//成交的股票数
    private BigDecimal dealStokeTotalAmount;//成交金额
    private BigDecimal buyOneNumber;//买一量
    private BigDecimal buyOnePrice;//买一价格
    private BigDecimal buyTwoNumber;//买二量
    private BigDecimal buyTwoPrice;//买二价格
    private BigDecimal buyThreeNumber;//买三量
    private BigDecimal buyThreePrice;//买三价格
    private BigDecimal buyFourNumber;//买四量
    private BigDecimal buyFourPrice;//买四价格
    private BigDecimal buyFiveNumber;//买五量
    private BigDecimal buyFivePrice;//买五价格
    private BigDecimal sellOneNumber;//卖一量
    private BigDecimal sellOnePrice;//卖一价格
    private BigDecimal sellTwoNumber;//卖二量
    private BigDecimal sellTwoPrice;//卖二价格
    private BigDecimal sellThreeNumber;//卖三量
    private BigDecimal sellThreePrice;//卖三价格
    private BigDecimal sellFourNumber;//卖四量
    private BigDecimal sellFourPrice;//卖四价格
    private BigDecimal sellFiveNumber;//卖五量
    private BigDecimal sellFivePrice;//卖五价格
    private Date createDate;//日期
    private String createTime;//时间
    //高级属性
    private BigDecimal amplitude; //振幅

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getYesterdayClosePrice() {
        return yesterdayClosePrice;
    }

    public void setYesterdayClosePrice(BigDecimal yesterdayClosePrice) {
        this.yesterdayClosePrice = yesterdayClosePrice;
    }

    public BigDecimal getTodayPrice() {
        return todayPrice;
    }

    public void setTodayPrice(BigDecimal todayPrice) {
        this.todayPrice = todayPrice;
    }

    public BigDecimal getTodayHighestPrice() {
        return todayHighestPrice;
    }

    public void setTodayHighestPrice(BigDecimal todayHighestPrice) {
        this.todayHighestPrice = todayHighestPrice;
    }

    public BigDecimal getTodayLowestPrice() {
        return todayLowestPrice;
    }

    public void setTodayLowestPrice(BigDecimal todayLowestPrice) {
        this.todayLowestPrice = todayLowestPrice;
    }

    public BigDecimal getDealStokeNumber() {
        return dealStokeNumber;
    }

    public void setDealStokeNumber(BigDecimal dealStokeNumber) {
        this.dealStokeNumber = dealStokeNumber;
    }

    public BigDecimal getDealStokeTotalAmount() {
        return dealStokeTotalAmount;
    }

    public void setDealStokeTotalAmount(BigDecimal dealStokeTotalAmount) {
        this.dealStokeTotalAmount = dealStokeTotalAmount;
    }

    public BigDecimal getBuyOneNumber() {
        return buyOneNumber;
    }

    public void setBuyOneNumber(BigDecimal buyOneNumber) {
        this.buyOneNumber = buyOneNumber;
    }

    public BigDecimal getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(BigDecimal buyOnePrice) {
        this.buyOnePrice = buyOnePrice;
    }

    public BigDecimal getBuyTwoNumber() {
        return buyTwoNumber;
    }

    public void setBuyTwoNumber(BigDecimal buyTwoNumber) {
        this.buyTwoNumber = buyTwoNumber;
    }

    public BigDecimal getBuyTwoPrice() {
        return buyTwoPrice;
    }

    public void setBuyTwoPrice(BigDecimal buyTwoPrice) {
        this.buyTwoPrice = buyTwoPrice;
    }

    public BigDecimal getBuyThreeNumber() {
        return buyThreeNumber;
    }

    public void setBuyThreeNumber(BigDecimal buyThreeNumber) {
        this.buyThreeNumber = buyThreeNumber;
    }

    public BigDecimal getBuyThreePrice() {
        return buyThreePrice;
    }

    public void setBuyThreePrice(BigDecimal buyThreePrice) {
        this.buyThreePrice = buyThreePrice;
    }

    public BigDecimal getBuyFourNumber() {
        return buyFourNumber;
    }

    public void setBuyFourNumber(BigDecimal buyFourNumber) {
        this.buyFourNumber = buyFourNumber;
    }

    public BigDecimal getBuyFourPrice() {
        return buyFourPrice;
    }

    public void setBuyFourPrice(BigDecimal buyFourPrice) {
        this.buyFourPrice = buyFourPrice;
    }

    public BigDecimal getBuyFiveNumber() {
        return buyFiveNumber;
    }

    public void setBuyFiveNumber(BigDecimal buyFiveNumber) {
        this.buyFiveNumber = buyFiveNumber;
    }

    public BigDecimal getBuyFivePrice() {
        return buyFivePrice;
    }

    public void setBuyFivePrice(BigDecimal buyFivePrice) {
        this.buyFivePrice = buyFivePrice;
    }

    public BigDecimal getSellOneNumber() {
        return sellOneNumber;
    }

    public void setSellOneNumber(BigDecimal sellOneNumber) {
        this.sellOneNumber = sellOneNumber;
    }

    public BigDecimal getSellOnePrice() {
        return sellOnePrice;
    }

    public void setSellOnePrice(BigDecimal sellOnePrice) {
        this.sellOnePrice = sellOnePrice;
    }

    public BigDecimal getSellTwoNumber() {
        return sellTwoNumber;
    }

    public void setSellTwoNumber(BigDecimal sellTwoNumber) {
        this.sellTwoNumber = sellTwoNumber;
    }

    public BigDecimal getSellTwoPrice() {
        return sellTwoPrice;
    }

    public void setSellTwoPrice(BigDecimal sellTwoPrice) {
        this.sellTwoPrice = sellTwoPrice;
    }

    public BigDecimal getSellThreeNumber() {
        return sellThreeNumber;
    }

    public void setSellThreeNumber(BigDecimal sellThreeNumber) {
        this.sellThreeNumber = sellThreeNumber;
    }

    public BigDecimal getSellThreePrice() {
        return sellThreePrice;
    }

    public void setSellThreePrice(BigDecimal sellThreePrice) {
        this.sellThreePrice = sellThreePrice;
    }

    public BigDecimal getSellFourNumber() {
        return sellFourNumber;
    }

    public void setSellFourNumber(BigDecimal sellFourNumber) {
        this.sellFourNumber = sellFourNumber;
    }

    public BigDecimal getSellFourPrice() {
        return sellFourPrice;
    }

    public void setSellFourPrice(BigDecimal sellFourPrice) {
        this.sellFourPrice = sellFourPrice;
    }

    public BigDecimal getSellFiveNumber() {
        return sellFiveNumber;
    }

    public void setSellFiveNumber(BigDecimal sellFiveNumber) {
        this.sellFiveNumber = sellFiveNumber;
    }

    public BigDecimal getSellFivePrice() {
        return sellFivePrice;
    }

    public void setSellFivePrice(BigDecimal sellFivePrice) {
        this.sellFivePrice = sellFivePrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(BigDecimal amplitude) {
        this.amplitude = amplitude;
    }
}
