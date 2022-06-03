package dev.designpattern.chainofresponsibility;

public abstract class AbstractATMHandeler implements ATMHandeler {
	protected AbstractATMHandeler nextAtmHandeler;
	
	public void nextHandeler(AbstractATMHandeler nextAtmHandeler) {
		this.nextAtmHandeler = nextAtmHandeler;
	}
}
