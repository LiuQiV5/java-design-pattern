package com.liuqi.v13;

/**
 * 设计模式之建造者模式
 * 建造者模式(Builder Pattern)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式。
 * ------------------------------------------------------
 * 角色建造器：抽象建造者
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public  abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}
