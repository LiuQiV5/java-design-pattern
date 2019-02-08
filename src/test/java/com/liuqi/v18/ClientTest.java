package com.liuqi.v18;

import org.junit.Test;

import java.io.IOException;

public class ClientTest {

    /**
     * 浅拷贝
     * 引用类型只会拷贝一份内存地址，只想同一份附件
     */
    @Test
    public void clientTestV1(){
        WeeklyLog log_previous, log_new;
        //创建原型对象
        log_previous = new WeeklyLog();
        log_previous.setDate(111.11);
        //创建附件对象
        Attachment attachment = new Attachment();
        //将附件添加到周报中
        log_previous.setAttachment(attachment);
        //调用克隆方法创建克隆对象
        log_new = (WeeklyLog) log_previous.clone();
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " +(log_previous.getAttachment() == log_new.getAttachment()));
        System.out.println(log_previous.getDate()==log_new.getDate());
    }

    /**
     * 深拷贝
     * 所有成员对象都会复制一份
     */
    @Test
    public void clientTestV2(){
        WeeklyLog log_previous, log_new = null;
        //创建原型对象
        log_previous = new WeeklyLog();
        log_previous.setDate(111.11);
        //创建附件对象
        Attachment attachment = new Attachment();
        //将附件添加到周报中
        log_previous.setAttachment(attachment);
        //调用深克隆方法创建克隆对象
        try {
            log_new =  log_previous.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("克隆失败！");
        }
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " +(log_previous.getAttachment() == log_new.getAttachment()));
        System.out.println(log_previous.getDate()==log_new.getDate());
    }
}
