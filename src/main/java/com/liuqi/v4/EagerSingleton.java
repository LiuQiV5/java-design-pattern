package com.liuqi.v4;

/**
 * 饿汉式单例
 * 缺点：不能实现延迟加载，不管将来用不用始终占据内存
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
