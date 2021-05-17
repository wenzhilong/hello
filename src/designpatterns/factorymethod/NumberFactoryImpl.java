package designpatterns.factorymethod;

import designpatterns.factorymethod.NumberFactory;

import java.math.BigDecimal;

/**
 * 产品接口是Number，NumberFactoryImpl返回的实际产品是BigDecimal：
 */
public class NumberFactoryImpl implements NumberFactory {
    public Number parse(String s) {
        return new BigDecimal(s); // 返回的实际产品是BigDecimal
    }
}
