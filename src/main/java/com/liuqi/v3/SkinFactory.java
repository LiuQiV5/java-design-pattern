package com.liuqi.v3;

/**
 * 设计模式之工厂模式（抽象工厂模式）
 * 抽象工厂模式：将一些相关的产品组成一个“产品族”，由同一个工厂来统一生产，解决工厂方法模式中工厂类职责太重的问题
 *（1）产品等级结构：产品等级结构即产品的继承结构，如一个抽象类是电视机，其子类有海尔电视机、海信电视机、TCL电视机，
 * 则抽象电视机与具体品牌的电视机之间构成了一个产品等级结构，抽象电视机是父类，而具体品牌的电视机是其子类。
 * （2）产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品，如海尔电器工厂生产的海尔电视机、海尔电冰箱，
 * 海尔电视机位于电视机产品等级结构中，海尔电冰箱位于电冰箱产品等级结构中，海尔电视机、海尔电冰箱构成了一个产品族。
 *-----------------------------------------------------------------------------------------------
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {

    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();

}