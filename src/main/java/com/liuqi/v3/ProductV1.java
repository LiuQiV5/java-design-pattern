package com.liuqi.v3;

/**
 * 简单工厂模式，不属于设计模式之一，但是也经常用
 * 实现单一职责原则，降低耦合度
 * 将创建对象的职责和使用对象的职责进行分离
 */
public abstract class ProductV1 {

    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
        System.out.println("公共方法");
    }
    //声明抽象业务方法
    public abstract void methodDiff();

}
