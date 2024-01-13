package dev.designpattern.prototype;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(String model, String engine) {
        super(model, engine);
    }
    
    public TwoWheeler(TwoWheeler twoWheeler) {
        super(twoWheeler);
    }

    @Override
    public Vehicle clone() {
        return new TwoWheeler(this);
    }
}
