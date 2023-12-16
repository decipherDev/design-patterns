package dev.designpattern.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		LoginButton loginButton = new LoginButton(new LargeSizedButton());
		SignInUsingOauthButton oauthButton = new SignInUsingOauthButton(new MediumSizedButton());
		ForgotCredentialsButton forgotCredentialsButton = new ForgotCredentialsButton(new SmallSizedButton());
		
		loginButton.draw();
		oauthButton.draw();
		forgotCredentialsButton.draw();
	}
}
