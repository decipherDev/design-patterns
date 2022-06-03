package dev.designpattern.chainofresponsibility;

public class ThousandNoteHandeler extends AbstractATMHandeler {
	private static final int TOTAL_NUMBER_OF_NOTES = 2;
	private static final int DENOMINATION = 2000;
	
	@Override
	public void dispenseCash(int amount) {
		 System.out.println("Dispensing 2000 Denomination Notes");
		 int denominationAvailable = TOTAL_NUMBER_OF_NOTES * DENOMINATION;
		 if (denominationAvailable < amount && nextAtmHandeler != null) {
			 nextAtmHandeler.dispenseCash(amount - denominationAvailable);
		 }
	}
	
}
