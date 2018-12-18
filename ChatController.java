package chat.controller;
import javax.swing.JOptionPane;

import chat.model.ChatBot;
import chat.view.ChatFrame;
public class ChatController
{//Data Members
	private ChatBot simpleBot;
	private ChatFrame appFrame;

	
	public void start ()
	{
		
		this.appFrame = new ChatFrame(this);
               // System.out.println(simpleBot.processText("test"));
               
		
	}
	public String interactWithChatbot(String text) {
		simpleBot = new ChatBot();
		String chatBotSays = simpleBot.processText(text);
		return chatBotSays;
	}
	public ChatController()
	{       
		
		
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