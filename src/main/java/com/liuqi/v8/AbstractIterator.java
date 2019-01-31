package com.liuqi.v8;

/**
 * 设计模式之迭代器模式
 * 迭代器模式：将聚合类中负责遍历数据的方法提取出来，封装到专门的类中，实现数据存储和数据遍历分离，无须暴露聚合类的内部属性即可对其进行操作
 *迭代器模式(Iterator Pattern)：提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示，其别名为游标(Cursor)。迭代器模式是一种对象行为型模式。
 *-------------------------------------------------------------------------
 * 抽象迭代器
 */
public interface AbstractIterator {
    //移至下一个元素
    public void next();
    //判断是否为最后一个元素
    public boolean isLast();
    //移至上一个元素
    public void previous();
    //判断是否为第一个元素
    public boolean isFirst();
    //获取下一个元素
    public Object getNextItem();
    //获取上一个元素
    public Object getPreviousItem();
}
