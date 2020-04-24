package com.scz.gof.singleton;

/**
 * 饿汉式单例模式:
 * 饿汉式单例模式代码中，static变量会在类装载时初始化，此时也不会涉及多个线程对象访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题。因此，可以省略synchronized关键字。
 * 问题：如果只是加载本类，而不是要调用getinstance()，甚至永远没有调用，则会造成资源浪费！
 */
public class Singleton01 {
    // 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
    private static Singleton01 instance = new Singleton01();
    private Singleton01() {}
    // 方法没有同步，调用效率高！
    public static Singleton01 getInstance() {
        return instance;
    }
}
