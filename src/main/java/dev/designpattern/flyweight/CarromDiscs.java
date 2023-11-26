package dev.designpattern.flyweight;

public class CarromDiscs {
	private int coordinateX;
	private int coordinateY;
	private final CarromDiscType type;
	
	public CarromDiscs(int coordinateX, int coordinateY, CarromDiscType type) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.type = type;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	public CarromDiscType getType() {
		return type;
	}
}
