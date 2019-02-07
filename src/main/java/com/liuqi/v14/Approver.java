package com.liuqi.v14;

/**
 * 设计模式之职责链
 * 职责链模式(Chain of Responsibility  Pattern)：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，
 * 将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。职责链模式是一种对象行为型模式。
 * -----------------------------------------------------------------
 * 审批者类：抽象处理者
 */
public abstract class Approver {

    //定义后继对象
    protected Approver successor;
    //审批者姓名
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);

}
