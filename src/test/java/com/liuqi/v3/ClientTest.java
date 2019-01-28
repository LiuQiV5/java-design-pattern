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

    /**
     * 测试工厂方法模式
     */
    @Test
    public void clientTestV2(){
        LoggerFactory factory = new DatabaseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();

        System.out.println("=========================");

        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }

    /**
     * 测试抽象工厂模式
     */
    @Test
    public void clientTestV3(){
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;

        factory = new SpringSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();

        System.out.println("=========================");

        factory = new SummerSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
