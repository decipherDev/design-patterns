package dev.designpattern.abstractfactory;

public class TataManufacturer extends Company {
    @Override
    public Twowheeler createTwowheelers() {
        return new TataBike();
    }

    @Override
    public Fourwheeler createFourwheelers() {
        return new TataCar();
    }
}
