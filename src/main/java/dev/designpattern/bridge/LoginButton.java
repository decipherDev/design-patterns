package dev.designpattern.bridge;

public class LoginButton extends Button {
	private final ButtonSize buttonSize;
	public LoginButton(ButtonSize buttonSize) {
		this.buttonSize = buttonSize;
	}
	
	@Override
	public void draw() {
		System.out.println("The Login button will be drawn with size "+ buttonSize.getSize());
	}

}
