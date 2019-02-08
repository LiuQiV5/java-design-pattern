package com.liuqi.v19;

/**
 * 设计模式之访问者模式
 * 访问者模式(Visitor Pattern):提供一个作用于某对象结构中的各元素的操作表示，
 * 它使我们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。访问者模式是一种对象行为型模式
 * ----------------------------------------------------
 * 部门类：抽象访问者类
 */
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
