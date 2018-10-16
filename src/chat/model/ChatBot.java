package chat.model;
import java.util.*;

import javax.swing.JOptionPane;


public class ChatBot
{ //Data Members
    private ArrayList<String> responseList ;
    private String currentUser ;
    private String joke ;
    private String content ;
    private ArrayList<String> spookyList ;
    
//    public ChatBot ()
//    {
//    	this.responseList = responseList;
//    	this.currentUser = currentUser;
//    	this.joke = joke;
//    	this.content = content;
//    	this.spookyList = spookyList;
// 
// 
//    }
    public String askName()
    {
    
    	currentUser = JOptionPane.showInputDialog("What Is Your Name");
    	return currentUser;
    }
    //Getters
    
   public ArrayList<String> getResponseList() 
   {
	   return responseList;
   }
   public String getCurrentUser()
   {
	   return currentUser;
   }
   public String getJoke()
   {
	   return joke;
   }
   public String getContent()
   {
	   return content;
   }
   public ArrayList<String> getSpookyList()
   {
	   return spookyList;
   }
   //Setters
   public void setResponseList(ArrayList<String> responseList)
   {
	   this.responseList=responseList;
	   
   }
   public void setCurrentUser(String currentUser)
   {
	   this.currentUser=currentUser;
	   
   }
   public void setJoke(String joke)
   {
	   this.joke=joke;
	   
   }
   public void setContent(String content)
   {
	   this.content=content;
	   
   }
   public void setSpookyList(ArrayList<String> spookyList)
   {
	   this.spookyList=spookyList;
	   
   }
   public ChatBot()
   {
	   this.joke = "why cant dinosuars drive? they are all dead";
	   this.currentUser = new String("Default");
	   this.content = new String("notin");
	   
	   this.responseList = new ArrayList<String>();
	   this.spookyList = new ArrayList<String>();
   }
}

   
