package com.scz.gof.builder;

public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
