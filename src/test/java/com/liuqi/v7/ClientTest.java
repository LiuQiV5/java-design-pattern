package com.liuqi.v7;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientTestV1(){
        DataViewer dataViewer1 = new XMLDataViewer();
        dataViewer1.Process();
        System.out.println("===================");
        DataViewer dataViewer2 =new ExcelDataViewer();
        dataViewer2.Process();
    }
}
