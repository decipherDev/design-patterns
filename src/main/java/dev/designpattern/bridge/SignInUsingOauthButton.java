package dev.designpattern.bridge;

public class SignInUsingOauthButton extends Button {
	private final ButtonSize buttonSize;
	
	public SignInUsingOauthButton(ButtonSize buttonSize) {
		this.buttonSize = buttonSize;
	}

	@Override
	public void draw() {
		System.out.println("The SignInUsingOauth button will be drawn with size " + buttonSize.getSize());
	}
}
