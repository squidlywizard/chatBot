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
			userText = JOptionPane.showInputDialog(null, "Type quit to quit");
		}
		
	}
	public String interactWithChatbot() {
		String fug = "fug";
		return fug;
	}
	public ChatController()
	{
		simpleBot = new ChatBot();
		
	}

}
