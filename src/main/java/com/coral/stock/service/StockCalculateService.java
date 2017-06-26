package com.coral.stock.service;

import com.coral.stock.model.StockModel;
import com.coral.stock.utils.BigDecimalUtils;
import com.coral.stock.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by ccc on 2017/6/26.
 */
@Service(StockCalculateService.SPRING_BEAN_NAME)
public class StockCalculateService {

    public final static String SPRING_BEAN_NAME = "service.StockCalculateService";

    public void amplitudeCalculate(StockModel stockModel) {
        BigDecimal highestPrice = stockModel.getTodayHighestPrice();
        BigDecimal lowestPrice = stockModel.getTodayLowestPrice();
        BigDecimal ycPrice = stockModel.getYesterdayClosePrice();
        if(!BigDecimalUtils.isNull(highestPrice,lowestPrice,ycPrice)) {
            BigDecimal dValue = highestPrice.subtract(lowestPrice);
            BigDecimal amplitude = dValue.multiply(ycPrice);
            stockModel.setAmplitude(amplitude);
        } else {
            stockModel.setAmplitude(BigDecimal.ZERO);
        }
    }

}
