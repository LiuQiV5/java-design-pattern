package com.liuqi.v4;

/**
 * .懒汉式单例
 * 缺点：懒汉式单例类线程安全控制烦琐，而且性能受影响
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() { }

    /**
     * 双重锁定
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
