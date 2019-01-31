package com.liuqi.v7;

/**
 * 设计模式之模板方法模式
 * 模板方法模式：定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 通俗来讲：在模板方法模式中，由于面向对象的多态性，子类对象在运行时将覆盖父类对象，子类中定义的方法也将覆盖父类中定义的方法，
 * 因此程序在运行时，具体子类的基本方法将覆盖父类中定义的基本方法，子类的钩子方法也将覆盖父类的钩子方法，
 * 从而可以通过在子类中实现的钩子方法对父类方法的执行进行约束，实现子类对父类行为的反向控制。
 * -----------------------------------------------------------------------------------------------------------
 * 这是一个抽象父类
 */
public abstract class DataViewer {

    //模板方法
    public void Process() {
        GetData();
        //如果不是XML格式的数据则进行数据转换
        if (IsNotXMLData()){
            ConvertData();
        }
        DisplayData();
    }

    //抽象方法：获取数据
    public abstract void GetData();

    //具体方法：转换数据
    public void ConvertData(){
        System.out.println("将数据转换为XML格式");
    }

    //抽象方法：显示数据
    public abstract void DisplayData();

    //钩子方法：判断是否为XML格式的数据,提供默认实现
    public boolean IsNotXMLData(){
        return true;
    }

}
