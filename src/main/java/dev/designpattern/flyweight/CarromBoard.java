package dev.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CarromBoard {
	private List<CarromDiscs> carromFlicks = new ArrayList<>();
	
	public void initialise() {
		String[] colors = new String[] {"white", "black"};
		for (String color : colors) {
			for (int i = 0; i < 9; i++) {
				carromFlicks.add(new CarromDiscs(0, 0, FlyWeightFactory.getFlicksTypeInstance(color, 10)));
			}
		}
		carromFlicks.add(new CarromDiscs(0, 0, FlyWeightFactory.getFlicksTypeInstance("yellow", 10)));
	}
	
	public void play() {
		//code goes here
	}
}
