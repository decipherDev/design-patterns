package dev.designpattern.abstractfactory;

public class SuzukiManufacturer extends Company {
    @Override
    public Twowheeler createTwowheelers() {
        return new SuzukiBike();
    }

    @Override
    public Fourwheeler createFourwheelers() {
        return new SuzukiCar();
    }
}
