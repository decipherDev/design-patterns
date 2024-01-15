package dev.designpattern.abstractfactory;

public class SuzukiBike implements Twowheeler {
    @Override
    public void assemble() {
        System.out.println("Suzuki Bike assembly");
    }
}
