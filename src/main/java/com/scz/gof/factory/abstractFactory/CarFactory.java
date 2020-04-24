package com.scz.gof.factory.abstractFactory;

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
