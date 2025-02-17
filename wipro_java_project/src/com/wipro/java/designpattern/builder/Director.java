package com.wipro.java.designpattern.builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("SUV Engine");
        builder.setTripComputer(true);
        builder.setGPS(false);
    }
}
