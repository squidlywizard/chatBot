package chat.view;


import javax.swing.JFrame ;
import chat.controller.ChatController;
import chat.view.ChatPanel;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController) 
	{
		super();
		
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1024, 768);
		this.setTitle("chat Bot and twitter");
		this.setResizable(false);
		this.setVisible(true);
	}

}
