package me.chulgil.prospring5.ch2;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {

		return "Hello World!";
		
	}

}
