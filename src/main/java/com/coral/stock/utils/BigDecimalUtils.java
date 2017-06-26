package com.coral.stock.utils;

import java.math.BigDecimal;

/**
 * Created by ccc on 2017/6/26.
 */
public class BigDecimalUtils {

    public static boolean isNull(BigDecimal decimal) {
        if (decimal == null) {
            return true;
        }
        return false;
    }

    public static boolean isNull(BigDecimal... decimals) {
        for(BigDecimal decimal : decimals) {
            if(isNull(decimal)) {
                return true;
            }
        }
        return false;
    }
}
