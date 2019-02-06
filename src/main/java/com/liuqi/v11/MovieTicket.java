package com.liuqi.v11;

/**
 * 策略模式的主要目的是将算法的定义与使用分开，也就是将算法的行为和环境分开
 * 策略模式(Strategy Pattern)：定义一系列算法类，将每一个算法封装起来，并让它们可以相互替换，
 * 策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。策略模式是一种对象行为型模式。
 * -----------------------------------------------------------------------------
 * 电影票：环境类
 */
public class MovieTicket {

    private double price;
    //维持一个对抽象折扣类的引用
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }

}
