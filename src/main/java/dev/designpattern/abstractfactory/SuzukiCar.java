package dev.designpattern.abstractfactory;

public class SuzukiCar implements Fourwheeler {
    @Override
    public void assemble() {
        System.out.println("Suzuki Car assembly");
    }   
}
