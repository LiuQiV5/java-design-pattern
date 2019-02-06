package com.liuqi.v12;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientTestV1(){
        Image image;
        ImageImp imp;
        image = new PNGImage();
        imp = new LinuxImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
