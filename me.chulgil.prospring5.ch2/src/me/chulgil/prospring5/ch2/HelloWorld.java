package me.chulgil.prospring5.ch2;

public class HelloWorld {

	public static void main(String[] args) {

		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		
		mr.setMessageProvider(mp);
		
		mr.render();
	}

}
