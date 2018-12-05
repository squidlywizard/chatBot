package chat.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import chat.controller.*;

public class ChatPanel extends JPanel
{
	
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JScrollPane chatPane;
	private SpringLayout layout;
	private JTextField chatField;
	private JTextArea chatArea;
	
public ChatPanel(ChatController appController) {
	super();
	
	chatButton = new JButton("Chat");
	saveButton = new JButton("Save");
	checkerButton = new JButton("Check Text");
	
	chatField = new JTextField("Talk to the bot here", 50);
	chatArea = new JTextArea("Chat Area",20, 50);
	
	chatPane = new JScrollPane();
	layout = new SpringLayout();
	
	
	
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
	
	chatPane.setColumnHeaderView(chatArea);
	chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	loadButton = new JButton("Load");
	chatPane.setRowHeaderView(loadButton);
	
	
}
public void setupPanel()
{
	this.setLayout(layout);
	this.setPreferredSize(new Dimension(800,600));
	this.setBackground(Color.MAGENTA);
	this.add(chatButton);
	this.add(saveButton);
	this.add(checkerButton);
	
	this.add(chatField);
//	this.add(chatArea);
	
	this.add(chatPane);
	
	
}
public void setupLayout() 
{   layout.putConstraint(SpringLayout.WEST, chatButton, 52, SpringLayout.EAST, loadButton);
	layout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, chatButton);
	layout.putConstraint(SpringLayout.EAST, saveButton, -47, SpringLayout.EAST, this);
	layout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, this);
}
public void setupListeners()
{
	
}
}
