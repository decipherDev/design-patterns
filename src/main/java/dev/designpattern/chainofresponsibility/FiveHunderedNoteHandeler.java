package dev.designpattern.chainofresponsibility;

public class FiveHunderedNoteHandeler extends AbstractATMHandeler {
	private static final int TOTAL_NUMBER_OF_NOTES = 4;
	private static final int DENOMINATION = 500;
	
	@Override
	public void dispenseCash(int amount) {
		 System.out.println("Dispensing 500 Denomination Notes");
		 int denominationAvailable = TOTAL_NUMBER_OF_NOTES * DENOMINATION;
		 if (denominationAvailable < amount && nextAtmHandeler != null) {
			 nextAtmHandeler.dispenseCash(amount - denominationAvailable);
		 }
	}
}
