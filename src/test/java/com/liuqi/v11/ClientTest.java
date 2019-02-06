package com.liuqi.v11;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientTestV1(){
        MovieTicket mt = new MovieTicket();

        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        Discount discount = new StudentDiscount();
        //注入折扣对象
        mt.setDiscount(discount);

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);

    }
}
