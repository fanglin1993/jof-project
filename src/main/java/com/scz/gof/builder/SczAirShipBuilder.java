package com.scz.gof.builder;

public class SczAirShipBuilder implements AirShipBuilder {
    //StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
    @Override
    public Engine builderEngine() {
        System.out.println("构建scz牌发动机！");
        return new Engine("scz牌发动机！");
    }

    @Override
    public EscapeTower builderEscapeTower() {

        System.out.println("构建逃逸塔");
        return new EscapeTower("scz牌逃逸塔");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("scz牌轨道舱");
    }

}