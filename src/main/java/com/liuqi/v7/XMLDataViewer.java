package com.liuqi.v7;

/**
 * 具体子类，实现具体算法
 */
public class XMLDataViewer extends DataViewer {
    @Override
    public void GetData() {
        System.out.println("从XML文件中获取数据。");
    }

    @Override
    public void DisplayData() {
        System.out.println("以柱状图显示数据。");
    }

    //覆盖父类的钩子方法
    @Override
    public boolean IsNotXMLData(){
        return false;
    }
}
