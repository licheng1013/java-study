package com.demo.工厂模式;

import com.demo.工厂模式.entity.AliPay;
import com.demo.工厂模式.entity.WechatPay;

/**
 * @author lc
 * @since 2022/5/16
 */
public abstract class AbstractFactory {
    public static Factory getInstance(String key) {
        Factory o = null;
        switch (key) {
            case "WechatPay":
                o = new WechatPay();
                break;
            case "AliPay":
                o = new AliPay();
                break;
        }
        return o;
    }
}
