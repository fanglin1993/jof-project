package com.scz.gof.singleton;

/**
 * 枚举式实现单例模式(没有延时加载)
 * 优点：实现简单；枚举本身就是单例模式，由JVM从根本上提供保障，避免通过反射和反序列化的漏洞！
 * 缺点：无延迟加载。
 */
public enum Singleton05 {
    //这个枚举元素，本身就是单例对象！
    INSTANCE;
    //添加自己需要的操作！
    public void singletonOperation(){}
}
