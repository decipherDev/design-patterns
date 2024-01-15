package dev.designpattern.abstractfactory;

public class TataCar implements Fourwheeler {
    @Override
    public void assemble() {
        System.out.println("Tata Car assembly");
    }   
}
