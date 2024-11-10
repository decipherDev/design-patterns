package dev.designpattern.prototype;

public abstract class Vehicle {
    private String model;
    private String engine;

    protected Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    protected Vehicle(Vehicle vehicle) {
        this.model = vehicle.model;
        this.engine = vehicle.engine;
    }
    
    protected abstract Vehicle copy();
}
