package dev.designpattern.chainofresponsibility;

public class ChainOfResponsibilityATMClient {
	public static AbstractATMHandeler build() {
		ThousandNoteHandeler thousandNoteHandeler = new ThousandNoteHandeler();
		FiveHunderedNoteHandeler fiveHunderedNoteHandeler = new FiveHunderedNoteHandeler();
		HunderedNoteHandeler hunderedNoteHandeler = new HunderedNoteHandeler();
		thousandNoteHandeler.nextHandeler(fiveHunderedNoteHandeler);
		fiveHunderedNoteHandeler.nextHandeler(hunderedNoteHandeler);
		return thousandNoteHandeler;
	}

}
