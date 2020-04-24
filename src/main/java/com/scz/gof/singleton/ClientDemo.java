package com.scz.gof.singleton;

import java.lang.reflect.Constructor;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.scz.gof.singleton.Singleton02");
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        Object obj = c.newInstance();
        System.out.println(obj);
        Object obj2 = c.newInstance();
        System.out.println(obj2);
    }
}
