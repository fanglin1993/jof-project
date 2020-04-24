package com.scz.gof.builder;

public class Client {
    public static void main(String[] args) {

        AirShipDirector director = new SczAirshipDirector(new SczAirShipBuilder());

        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName());

        ship.launch();

    }
}
