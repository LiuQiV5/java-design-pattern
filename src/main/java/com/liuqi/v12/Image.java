package com.liuqi.v12;

/**
 * 设计模式之桥接模式
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * ----------------------------------------------------
 * 抽象图像类：抽象类
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
