package com.scz.gof.factory.factorymethod;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
