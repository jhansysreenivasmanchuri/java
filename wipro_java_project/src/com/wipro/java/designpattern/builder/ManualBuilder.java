package com.wipro.java.designpattern.builder;

public class ManualBuilder implements Builder {
    private Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.setGPS(hasGPS);
    }

    public Manual getResult() {
        return this.manual;
    }
}
