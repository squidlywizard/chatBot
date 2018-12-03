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
		String userText = "nothingNow";
		while(!userText.contains("quit")) {
			//simpleBot.setCurrentUser();  
			userText = interactWithChatbot(userText);
		}
		
	}
	public String interactWithChatbot(String text) {
		
		String userText = JOptionPane.showInputDialog(null, "yo what do you want?");
		String chatBotSays = simpleBot.processText(userText);
		if (text == null) {
			chatBotSays = "null";
		}
		return chatBotSays;
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

}
