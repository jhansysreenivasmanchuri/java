package com.wipro.java.designpattern.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setGPS(hasGPS);
    }

    public Car getResult() {
        return this.car;
    }
}
