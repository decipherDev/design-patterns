package dev.designpattern.abstractfactory;

public class AbstractFactoryDemo {
   public static void main(String[] args) {
        Company suzukiCompany = new SuzukiManufacturer();
        Company tataCompany = new TataManufacturer();
        Twowheeler suzukiBike = suzukiCompany.createTwowheelers();
        Fourwheeler suzukiCar = suzukiCompany.createFourwheelers();
        Twowheeler tataBike = tataCompany.createTwowheelers();
        Fourwheeler tataCar = tataCompany.createFourwheelers();
        tataBike.assemble();
        tataCar.assemble();
        suzukiBike.assemble();
        suzukiCar.assemble();
   } 
}
