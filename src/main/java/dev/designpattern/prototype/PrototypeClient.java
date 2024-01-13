package dev.designpattern.prototype;

import dev.designpattern.prototype.VehicleRegistry.VehicleType;

public class PrototypeClient {
   public static void main(String[] args) {
        Vehicle carOne = VehicleRegistry.getVehicle(VehicleType.FOUR_WHEELER);
        Vehicle carTwo = VehicleRegistry.getVehicle(VehicleType.FOUR_WHEELER);
        System.out.println(carOne.hashCode() == carTwo.hashCode()); 
   } 
}
