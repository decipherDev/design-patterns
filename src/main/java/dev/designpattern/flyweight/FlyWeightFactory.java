package dev.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private static Map<String, CarromDiscType> map = new HashMap<>();
	
	public static CarromDiscType getCarromDiscTypeInstance(String color, int cost) {
		if (map.containsKey(color)) {
			return map.get(color);
		} else {
			CarromDiscType cdt = new CarromDiscType(color, cost); 
			map.put(color, cdt);
			return cdt;
		}
	}
}
