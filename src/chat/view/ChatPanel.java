package chat.view;

import java.awt.Color;
import java.awt.Dimension;

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
	private JButton mannyTheRedundantButton;

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
	mannyTheRedundantButton = new JButton();






	setLayout(layout);

	setupScrollPane();
	setupPanel();
	setupLayout();	
	setupListeners();


}
public void setupScrollPane()
{
	chatArea.setEditable(false);
	chatArea.setLineWrap(true);
	chatArea.setWrapStyleWord(true);

	chatPane.setViewportView(chatArea);
	chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);



}
public void setupPanel()
{
	this.setLayout(layout);
	this.setPreferredSize(new Dimension(1024,768));
	this.setBackground(Color.pink);
	this.add(chatButton);

	this.add(saveButton);
	this.add(checkerButton);

	this.add(chatField);
	//this.add(chatArea);

	this.add(chatPane);
	this.add(loadButton);
	this.add(mannyTheRedundantButton);







}
public void setupLayout() 
{ layout.putConstraint(SpringLayout.NORTH, chatField, 25, SpringLayout.SOUTH, chatArea);
	
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