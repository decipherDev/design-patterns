package dev.designpattern.prototype;

public abstract class Vehicle implements Cloneable {
    private String model;
    private String engine;

    public Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public Vehicle(Vehicle vehicle) {
        this.model = vehicle.model;
        this.engine = vehicle.engine;
    }

    @Override
    protected abstract Vehicle clone();
}
