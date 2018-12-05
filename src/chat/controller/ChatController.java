package chat.controller;
import javax.swing.JOptionPane;

import chat.model.Chatbot;
import chat.view.*;
public class ChatController
{//Data Members
	private Chatbot simpleBot;
	private ChatFrame appFrame;

	
	public void start ()
	{
		
		
		
	}
	public String interactWithChatbot(String text) {
		
		String output = "";
		output += simpleBot.processText(text);
		
		return output;
	}
	public ChatController()
	{
		simpleBot = new Chatbot(null);
		this.appFrame = new ChatFrame(this);
		
	}
//	public Boolean useChatbotCheckers(){
//		return true;
//	}
	
	public String useChatbotCheckers(String chatCheckers)
	{  
		String var = "fug";
		if (chatCheckers.equals("spooky")) 
		{
			var += "Halloween";
		}
			
		
		return var;
	}
	public String getChatbot() {
		return "fug";
	}
	public ChatFrame getChatFrame()
	{
		return appFrame;
		
	}

}
