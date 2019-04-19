package chat.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.*;

public class ChatPanel extends JPanel implements ActionListener
{
	private ChatController appy;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;

	private JScrollPane chatPane;
	private SpringLayout layout;
	private JTextField chatField;
	private JTextArea chatArea;
	private JButton tweetButton;
	private JButton searchTwitterButton;
	
	private JPanel buttonPanel;

public ChatPanel(ChatController appController) {
	super();

	chatButton = new JButton("Chat");
	saveButton = new JButton("Save");
	checkerButton = new JButton("Check Text");
	chatArea = new JTextArea("",20, 50);
	chatField = new JTextField("Talk to the bot here", 50);
	loadButton = new JButton("Load");
	chatPane = new JScrollPane();
	layout = new SpringLayout();
	tweetButton = new JButton("send tweet");
	searchTwitterButton = new JButton("search twitter");
	
	buttonPanel = new JPanel(new GridLayout(1,0));
	






	setLayout(layout);
	

	setupScrollPane();
	setupPanel();
	setupLayout();	
	setupListeners();
	setupButtons();


}
private void setupButtons()
{
	buttonPanel.add(saveButton);
	buttonPanel.add(loadButton);
	buttonPanel.add(chatButton);
	buttonPanel.add(checkerButton);
	buttonPanel.add(tweetButton);
	buttonPanel.add(searchTwitterButton);
}
public void setupScrollPane()
{
	chatArea.setEditable(false);
	chatArea.setLineWrap(true);
	chatArea.setWrapStyleWord(true);

	chatPane.setViewportView(chatArea);
	



}
public void setupPanel()
{
	this.setLayout(layout);
	this.setPreferredSize(new Dimension(1024,768));
	buttonPanel.setPreferredSize(new Dimension(900,150));
	buttonPanel.setBackground(Color.yellow);
	this.setBackground(Color.pink);
	
	this.add(chatField);

	this.add(chatPane);
	this.add(buttonPanel);
	







}
public void setupLayout() 
{ layout.putConstraint(SpringLayout.NORTH, chatField, 25, SpringLayout.SOUTH, chatArea);
	layout.putConstraint(SpringLayout.WEST, buttonPanel, 13, SpringLayout.WEST, chatPane);
	layout.putConstraint(SpringLayout.SOUTH, buttonPanel, -104, SpringLayout.SOUTH, this);
	layout.putConstraint(SpringLayout.EAST, buttonPanel, -61, SpringLayout.EAST, this);
	chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	layout.putConstraint(SpringLayout.WEST, chatArea, 50, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.EAST, chatArea, -50, SpringLayout.EAST, this);
	layout.putConstraint(SpringLayout.NORTH, chatArea, 50, SpringLayout.NORTH, this);
	layout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
	layout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
	layout.putConstraint(SpringLayout.WEST, chatField, 50, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.EAST, chatField, -50, SpringLayout.EAST, this);
}
public void actionPerformed(ActionEvent mouseEvent)
{
    Object whatsUsed = mouseEvent.getSource();
    appy = new ChatController();
    if (whatsUsed == chatButton)
    {      

      chatArea.insert(appy.interactWithChatbot(chatField.getText()) , 0);

    } else if (whatsUsed == chatField)
    {

        chatArea.insert(appy.interactWithChatbot(chatField.getText()), 0);
    }
}
public void setupListeners()
{

    chatButton.addActionListener(this);
    chatField.addActionListener(this);
    //saveButton.addActionListener(this);




}

}