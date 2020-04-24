package com.scz.gof.singleton;

/**
 * 测试静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载！
 */
public class Singleton04 {
    private static class SingletonClassInstance {
        private static final Singleton04 instance = new Singleton04();
    }
    private Singleton04(){}
    //方法没有同步，调用效率高！
    public static Singleton04  getInstance(){
        return SingletonClassInstance.instance;
    }
}
