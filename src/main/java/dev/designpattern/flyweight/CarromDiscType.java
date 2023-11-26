/**
 * Intrinsic properties (Flyweight)
 */
package dev.designpattern.flyweight;

public class CarromDiscType {
	private final String color;
	private final Integer score;
	
	CarromDiscType(String color, Integer score) {
		this.color = color;
		this.score = score;
	}
	
	public String getColor() {
		return color;
	}

	public Integer getScore() {
		return score;
	}
}
