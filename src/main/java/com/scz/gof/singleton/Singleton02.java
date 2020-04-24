package com.scz.gof.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例模式
 */
public class Singleton02 implements Serializable {
    // 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
    private static Singleton02 instance;
    private Singleton02() throws Exception {
        if (instance != null) {
            throw new RuntimeException("只能创建一个对象");
        }
    }
    // 方法同步，调用效率低！
    public static synchronized Singleton02 getInstance() throws Exception {
        if(instance == null){
            instance = new Singleton02();
        }
        return instance;
    }
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
