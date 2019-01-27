package com.liuqi.v2;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientV2Test(){
        Component c1,c2;
        c1 = new Window();
        c1 = new ScrollBarDecorator(c1);
        c1.display();

        System.out.println("=========================");

        c2 = new TextBox();
        c2 = new ScrollBarDecorator(c2);
        c2 = new BlackBorderDecorator(c2);
        c2.display();
    }
}
