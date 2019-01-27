package com.liuqi.v1;

/**
 * 这是一个观察者接口
 */
public interface Observer {

    public String getName();
    public void setName(String name);
    public void help(); //声明支援盟友方法
    public void beAttacked(Subject acc); //声明遭受攻击方法

}
