package com.liuqi.v3;

import org.junit.Test;

public class ClientTest {

    /**
     * 测试简单工厂模式
     */
    @Test
    public void clientTestV1(){
        ProductV1 a = FactoryV1.getProduct("A");
        a.methodSame();
        a.methodDiff();
    }
}
