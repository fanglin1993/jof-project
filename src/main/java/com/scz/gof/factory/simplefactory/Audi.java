package com.scz.gof.factory.simplefactory;

public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪在跑！");
    }
}