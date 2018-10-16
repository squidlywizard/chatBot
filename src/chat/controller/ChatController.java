package chat.controller;
import javax.swing.JOptionPane;

import chat.model.ChatBot;
public class ChatController
{//Data Members
	private ChatBot simpleBot;

	
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
		simpleBot = new ChatBot();
		
	}

}
