package com.liuqi.v18;

import java.io.*;

/**
 * 设计模式之原型模式
 * 原型模式(Prototype  Pattern)：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
 * --------------------------------------------------
 * 工作周报WeeklyLog
 */
public class WeeklyLog implements Cloneable,Serializable {

    private Attachment attachment;

    private String name;

    private  double date;

    private  String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog)obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持复制！");
            return null;
        }
    }

    //使用序列化技术实现深克隆
    public WeeklyLog deepClone() throws IOException,ClassNotFoundException,OptionalDataException {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (WeeklyLog)ois.readObject();
    }

}
