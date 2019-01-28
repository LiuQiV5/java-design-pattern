package com.liuqi.v3;

public class FactoryV1 {
    //静态工厂方法
    public static ProductV1 getProduct(String arg) {
        ProductV1 product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductV1();
            //初始化设置product
        }
        else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductV2();
            //初始化设置product
        }
        return product;
    }

}
