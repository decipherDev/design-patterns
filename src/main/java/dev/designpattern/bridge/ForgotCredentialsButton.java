package dev.designpattern.bridge;

public class ForgotCredentialsButton extends Button {
	private final ButtonSize buttonSize;
	public ForgotCredentialsButton(ButtonSize buttonSize) {
		this.buttonSize = buttonSize;
	}
	
	@Override
	public void draw() {
		System.out.println("The Forgot credential button will be drawn with size " + buttonSize.getSize());
	}
}
