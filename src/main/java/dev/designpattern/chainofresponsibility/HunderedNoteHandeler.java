package dev.designpattern.chainofresponsibility;

public class HunderedNoteHandeler extends AbstractATMHandeler {
	
	@Override
	public void dispenseCash(int amount) {
		 System.out.println("Dispensing 100 Denomination Notes");
	}
}
