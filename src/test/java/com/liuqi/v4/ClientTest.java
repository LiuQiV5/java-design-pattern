package com.liuqi.v4;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientTestV1(){
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
