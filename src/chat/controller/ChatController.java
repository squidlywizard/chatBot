package chat.controller;
import javax.swing.JOptionPane;

import chat.model.Chatbot;
public class ChatController
{//Data Members
	private Chatbot simpleBot;

	
	public void start ()
	{
		String userText = "nothingNow";
		while(!userText.equalsIgnoreCase("quit")) {
			//simpleBot.setCurrentUser();  
			userText = interactWithChatbot(userText);
		}
		
	}
	public String interactWithChatbot(String text) {
		
		String userText = JOptionPane.showInputDialog(null, "yo what do you want?");
		String chatBotSays = simpleBot.processText(userText);
		return chatBotSays;
	}
	public ChatController()
	{
		simpleBot = new Chatbot(null);
		
	}
//	public Boolean useChatbotCheckers(){
//		return true;
//	}
	
	public String useChatbotCheckers(String chatCheckers)
	{
		
		return null;
	}
	public String getChatbot() {
		return "fug";
	}

}
