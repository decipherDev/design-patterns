package dev.designpattern.prototype;

public class FourWheeler extends Vehicle {
    private int doors;
    private String speakers;
    
    public FourWheeler(String model, String engine, int doors, String speakers) {
        super(model, engine);
        this.doors = doors;
        this.speakers = speakers;
    }

    public FourWheeler(FourWheeler fourWheeler) {
        super(fourWheeler);
        this.doors = fourWheeler.doors;
        this.speakers = fourWheeler.speakers;
    }

    @Override
    public Vehicle clone() {
        return new FourWheeler(this);
    }
}
