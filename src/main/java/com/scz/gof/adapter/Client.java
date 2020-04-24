package com.scz.gof.adapter;

public class Client {
    public static void main(String[] args) {
        Target t1 = new Adapter();
        t1.handleReq();
        Adaptee a = new Adaptee();
        Target t2 = new Adapter2(a);
        t2.handleReq();
    }
}
