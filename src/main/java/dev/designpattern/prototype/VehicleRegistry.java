package dev.designpattern.prototype;

import java.util.EnumMap;
import java.util.Map;

public class VehicleRegistry {
   private static Map<VehicleType, Vehicle> cache = new EnumMap<>(VehicleType.class);

   static {
        cache.put(VehicleType.TWO_WHEELER, new TwoWheeler("FZS", "150CC"));
        cache.put(VehicleType.THREE_WHEELER, new ThreeWheeler("FZSPiaggio", "1000CC", 2, 10));
        cache.put(VehicleType.FOUR_WHEELER, new FourWheeler("Hyundai Creta", "1500CC", 4, "SONY"));
   }
   
   private VehicleRegistry() {
	   
   }
   
   public static Vehicle getVehicle(VehicleType vehicleType) {
        return cache.get(vehicleType).copy();
   }

   enum VehicleType {
        TWO_WHEELER,
        THREE_WHEELER,
        FOUR_WHEELER
   }
}
