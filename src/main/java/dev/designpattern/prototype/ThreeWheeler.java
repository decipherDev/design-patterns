package dev.designpattern.prototype;

public class ThreeWheeler extends Vehicle {
    private int loadingSpace;
    private int doors;

    public ThreeWheeler(String model, String engine, int doors, int loadingSpace) {
        super(model, engine);
        this.doors = doors;
        this.loadingSpace = loadingSpace;
    }

    public ThreeWheeler(ThreeWheeler threeWheeler) {
        super(threeWheeler);
        this.doors = threeWheeler.doors;
        this.doors = threeWheeler.loadingSpace;
    }

    @Override
    public Vehicle clone() {
        return new ThreeWheeler(this);
    }
}
