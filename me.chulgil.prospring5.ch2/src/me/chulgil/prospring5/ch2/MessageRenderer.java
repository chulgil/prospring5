package me.chulgil.prospring5.ch2;

public interface MessageRenderer {
	
	void render();
	
	void setMessageProvider(MessageProvider provider);
	
	MessageProvider getMessageProvider();
	

}
