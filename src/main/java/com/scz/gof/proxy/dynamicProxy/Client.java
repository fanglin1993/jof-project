package com.scz.gof.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(realStar.getClass().getClassLoader(),
                realStar.getClass().getInterfaces(), handler);
        proxy.sing();

    }
}
