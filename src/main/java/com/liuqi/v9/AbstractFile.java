package com.liuqi.v9;

/**
 * 设计模式之组合模式
 * 组合模式为处理树形结构提供了一种较为完美的解决方案，它描述了如何将容器和叶子进行递归组合，使得用户在使用时无须对它们进行区分，可以一致地对待容器和叶子。
 * 组合模式(Composite Pattern)：组合多个对象形成树形结构以表示具有“整体—部分”关系的层次结构。
 * 组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，组合模式又可以称为“整体—部分”模式，它是一种对象结构型模式。
 * --------------------------------------------------
 * 这是一个抽象文件类：抽象构件（可以是文件也可以是文件夹）
 */
public abstract class AbstractFile {
    //默认实现
    public  void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }
    public  void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    };
    public  AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }
    public abstract void killVirus();

}
