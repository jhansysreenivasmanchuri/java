package com.wipro.java.designpattern.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Build a car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built successfully.");

        // Build a manual
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSUV(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Manual built successfully.");
    }
}
