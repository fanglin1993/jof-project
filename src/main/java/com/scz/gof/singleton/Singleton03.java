package com.scz.gof.singleton;

/**
 * DCL(Double Check Lock)双端检索机制
 * 双重检查锁实现单例模式
 * 这个模式将同步内容下方到if内部，提高了执行的效率不必每次获取对象时都进行同步，只有第一次才同步创建了以后就没必要了。
 * 问题：由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题。不建议使用。
 */
public class Singleton03 {
    private static Singleton03 instance = null;
    private Singleton03() {}
    public static Singleton03 getInstance() {
        if (instance == null) {
            Singleton03 sc;
            synchronized (Singleton03.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (Singleton03.class) {
                        if(sc == null) {
                            sc = new Singleton03();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
}
