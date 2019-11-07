package com.night.pattern.strategy.service.impl;


import com.night.pattern.strategy.service.PayService;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/7 9:35
 */
public class AliayPayService implements PayService {
    @Override
    public void payMethod() {
        System.out.println("aliay pay ");
    }
}
