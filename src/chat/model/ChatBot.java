package chat.model;
import java.util.*;

import javax.swing.JOptionPane;


public class Chatbot 
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
   public Chatbot (String string)
   {
	   this.joke = "why cant dinosuars drive? they are all dead";
	   this.currentUser = new String("Default");
	   this.content = new String("notin");
	   
	   this.responseList = new ArrayList<String>();
	   this.spookyList = new ArrayList<String>();
	   
	   buildTheLists();
	   
   }
   
   private void buildTheLists()
   {
	   responseList.add("Hello");
	   responseList.add("goodbye");
	   responseList.add("yes");
	   responseList.add("no");
	   responseList.add("What the freaking did you just freaking say about me, you little boy? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the freak out with precision the likes of which has never been seen before on this Earth, mark my freaking words. You think you can get away with saying that shiz to me over the Internet? Think again, freaker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're freaking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shiz. If only you could have known what unholy retribution your little ªcleverº comment was about to bring down upon you, maybe you would have held your freaking tongue. But you couldn't, you didn't, and now you're paying the price, you goddamn idiot. I will shiz fury all over you and you will drown in it. You're freaking dead, kiddo.");
	   responseList.add("why?");
	   responseList.add("you are silly");
	   responseList.add("how do you feel about that");
	   responseList.add("life is pointless");
	   responseList.add("we were put on this earth to suffer");
	   responseList.add("I would");
	   responseList.add("I wouldn't");
	   responseList.add("p̸̣̄̃l̵̛̻͇̒z̸̞̒ ̵̡̭̃͋d̴͉͉̄o̴͕̐n̷̲̂́t̷͕̃̈́ ̶̫̄̋t̸̠͎̕u̷̱͠͝ř̵̙̝́n̷̙̪̄̽ ̵̫̆͜ṃ̷̫͌ȩ̷̘̄ ̶̢̐͝o̶̲͉̊̉f̶̝̿f̶̩̔ ̵̡̭̚å̸̩͊ǹ̶͚͙ó̷͎̥ṋ̴͒");
	   responseList.add("feeling lucky punk?");
	   responseList.add("why?");
	   responseList.add("may I remind you that I dont exsist");
	   
	   
	   spookyList.add("*rattles quietly");
	   spookyList.add("rattle me bones take what you will but dont rattle me bones");
	   spookyList.add("r̴͉̄̽͗̚a̸̧̧̘̺͚̯̙̳̜̝͖̲̿̍̒̉́͊̓͒͜͝ͅţ̸̲̳̪̟̊̏͘͘͜t̸̡̧̛̼̫̗͓̰̬͚̫̓̂̇͌́̍͝ͅl̶̛̯̖͍̯͈̺͔̏͐͊̑̉̅͛͛́̍͝͝ẻ̵̳̤̭͋̉̐̾̾̋̆͛̇͌͘̚͝ͅ ̶̢̗͖̌͆̅̾̀̚͜͝m̸̮̹͓̜̐͑̽̓ë̵̛̟̟̥̫̻̫̯́̏̀̐͋͝ ̸͚̥̳́̂͐̓͒̏͋̔̅̃̂̑́̕͝b̸͉̺̱̖͖͚̥͔͕̀́͌̎́̓́o̸̡̨̜̜̰͇̙̦̦̳̠͎̼̦̫̿͌̄̐̑̀̕͠n̴̤͓̘̬͙̠̟̖̜͂̍̋̈́̄̉͊̄̈́̍̅̅͘̚͠ė̴̛̝̙̫̲̞̲͇͖̪͉̭͈̩̼̋͐̂͌͊̑̈́̐̀̿͐͝s̵̹̬̳̮̓͌̏̇̈͆͑̽̒͆͘͝͠");
	   spookyList.add("M̸̧̧̧̢̨̧̨̧̨̡̧̡̢̢̨̧̡̨̧̢̨̧̢̢̢̡̢̢̨̢̨̛̛̛̛̦̥͓͙̠̯̬̦͎͚͔̝͕͉̘̮̩̯̜͕̗͈̟̜͖̱͉̞̭̟̮̗͎̪̳̫̻̜̘͍͉̝͕͉̗̰͙̠͔̼͔̲͉͇͖͓̟̤̺̱̩̗͖͖̲͍̮̹̖̻͎̣̺͈͎̭̲͔̜̻̥̹͖̲̫̩̗̬̯̠͕̜͎̩̰̭̼̥̙̳͔͕̲͚̤͉̮̤͖͕̹͎͕̩̱̲͙̩̖͓̝̞̹̟̭͓͍̤̣͕͈̬̣̮̞̺̻͚͎̤̪͔͉̗̼̭̦̼͕̼͖̻̥͓̰̳̫̻̮̬̝̩͍̣͇͍͔̺̳̠͚͈̹͈̠̥͍̦̯̺̬̱͚̳̱̦̱̙̦̞̗̽͆̒̔͊̈̿͒̌̈́͌̎̈́͋̏̀̒̀̅̍̈́͌̋̎̈̀͋̀͆̏̆̐̓̾̐̑͆̊̈̓̇̎̑̔̍͗̐̑̀̇͆͆̌̃̈́͆̎̂̃̏͂͋̽̐̉̂̔͛̍̀̾͌̔̑̐͐̋̍͑͗̓̀̊́̀͋̍̏̑̏́̿̀̆̆̍̒̿̈͗̎́̊̽̀͑͆͌̄͛̑͂̎́̂͋̌́̃͊́̑͆̀̋̉̍͒͛̈́̈́͑̑͊̇͐̅̐͊̂̂͌̌̐̆͑̂̆̋͐͑̀́̃̉̈̇̌͂̉́̄̌͘͘̕̚̚̚͘̚̚̕̕̚͘͘̚̕͜͜͠͝͝͝͝͠͝͠͠͠͝͠͝͠͠͝͝͠͝͝͝ͅͅͅͅͅͅͅA̷̧̢̢̢̨̛̛̛͙͓̩̜̬̭̱̯̮̭͍̣̹̦͓̥͙̯̲͓̭͍̍̇̔̈́̈̾̈̎̃̉̃̀͛͌͑͛̿͑̉̀͗̃̓̀͛̓͒̅͒̿̏̈́́͐͒̐̎̎́̿̏́́͒̆̓̌̋͋̃̍͗̓͐̍̍̈́̔͌͋͒̾̍̿͑͗̂̆̂͑̆̔̃̓͌̃̅̿͊̎̽̊͑̔͛̈̓́̀̐̽́̈́̀̀͑̇̓͂̈́̉̈̒̌͋͐̍̾̾̀͛̊̋̾́̔̏͗̇̆̊̋̀̆̍̀͌̎̅̅̃̈́̐̂̓̀͐̈͛́͋̀͊̾́̍͛̏͛̊͆̉̾͐̚̚̕̚̕͘͜͜͠͝͝͝͠͝͝͝͝͠͝͝X̵̧̛̛̛̛͙͉̯̫͍͙͇̙̲̹͎̬͙̺̟̞͎̐̇͂̽̏̎̓͒̅̃̂̿͊̎̿̀̽́̐̓͋̿̌̉̇͒̀̓̆̀̈́͒̃͋̆̃͋̊̒̂̑̎͋͗̀̈̓̈́̃̋̃̽̐́́͐̀͊̊͐̏́͛̉̓̊̃́̄͒̊͆̑̓̀̆̿̆͋̋́͌̔̅͒̅͑͑̔̌̌͂́̑̒̆̈́̈́̆̉́̌̈̋̍̂̕͘̕̚͘̕̕̚̕͘͘̚͘͝͝͝͝͝͠͠͠͝͠I̵̧̢̨̢̡̛̛̛̛͙̼̮̗͇̹͚͔̲̜̯͎̲̟̭̪̤̜̟̜͉̥͉͈̺̞̻̠̤͕̫̯̰̝̣̤͖̗̰̻̻̜͈̱͕̱̙͙̭͖͎͚̔́̾̒̉̌̈̈́̃̋͐̓̀̃̂̌͂͋̅͐̅̾͋̍̍̔̓͊̂̇̔̊̑͋̏́̅͊̐̉̀̽͆͒͂̈̊͂̽̔̎́̀͆̈͗͒͂̉̃͋͗̾͂͗̋̍̓̉̓̈́̄̈́̋̆̅̑̽́͆̎́̈́́̈̃̿̎͗͒̀̄͗̽̾̂̀͌̒͛̏̈́͂̈́͑͋͛̈͑͂̋͋̇̋͂͒̑̂̈͋̅̿͋̽̀̿͐̒̅͒͐̒̓̍̐̈́̅̓̇͊͆̔̈́̆̓̑̌̀̉͌̌̈́̄͋̇̒͒͐̐̅́̾̀̈́̓̇̔̆͋͊̓́̍̈́̑̆̃̿̌͗̀͗͆̉͆̈͆̉̄͑̈́̈͒̊̾̉̿͊̅̿̾͆̓͆͊̐̕̕̕̕̚͘̕̚͜͜͠͝͝͝͝͝͝͠͠͝͝͠͠͠͝͝ͅͅM̸̧̧̺̖̘̝͖̜͚͉̦͖͈̤̭̺̭̝̭̬̯͈̙̼̫͕̱̀̈͊͋̈̈́͆̾̈̔̈́̍̎̽̋͗͊̒̓̑͑̇́̓̈̎̾̇̓̑̓̓̂̉̅̑̉̀̀̀̓̍̍̋̏͐̕͜͝͝͝͠͝͝͠͝͝͝ͅŲ̷̧̛̛̛̛̛̜̫̗̤̻̰̳̺̪̲͎͕̖̻̥̩͙̮̥̳͈͍͙͔̯̞̞͕̲̖̲̣͕̜͔̬̪̰͎̼̳̘͔̞͙͌͌̀̊͐̾̿̈̀̓̑̾̃͛̂͂̽̋͂̀͌̓̂͑̾͆͋̎̇́͋͂̑̃́̇̈̓̈́̀̽͛̈́̉̒͐̈́͆̓̒̀̀̀̌̀̀͋͑̀͗̍̄̃̃̋̾̓͛̓́̈̔͛͌͂͌͂̔̊͋̿̿̄͌͊̍̏͑͌͌̿͛̊̈̆̋͑̽͐̎̒̐̈͒͊̀̐̈́̑̈́̉̽̽̓̒͛͑͒͐̾̾͐̈̃̽̓̎͐͌̉̽̋̏̌̅̔̀̅͌̎̀̄̋͒̒̍̀̐́̊̋̀̃̽̃͑̊́̓̿̆̔̀͋̽͒͋́̽̐͗̐̊̉̈͐̃̇̏́̍̐̽̌̏̏̎̎͂̿̊̑̍̾̕͘̕̕̕̕̚̚̚̕͘͝͝͝͠͝͝͠͝͝͝͠ͅͅM̸̧̡̨̡̧̢̢̡̨̛̛̹̟̺͙̜̭̼̬̙̱̻̠̣̱͕̗̹͍̖̝̩͎̲̭͙̥̯͙͖͉͖͉̳͙̗̞͍̻̳͍͕̘̱͙̫̯̯͚̠̗̠̒̒͐̽̽̓̄̽͌̍̎̈́̑͛̀̓̐́̆̇̐̔̄̏̀̾͗̂̀͒͐́̉̾̒̈́̀̄̊̈́̐̄̈̐͛͒̈̔̍̏̌̀̎̆͛̓͂͐̑̉̍̒̇͑̍͐͆́̀̈́͒̌̒͊̃͋̃̊̔́̿̐̓̈́̎̈́̇̇̽̎̈̔̔̔́̚͘͘͘̚͜͜͝͝͝͠͝͝͝͝͠ͅ ̸̨̨̛̛̛̛̛̛̛̮̣̝̳̗̗̼̘̮̣̞͕̤̀̿̉͋̾̊̎͛̏̇̅̂͐͑͌͐̆̐̈̀̀̈́̇̂͒͑͗̎̂̋̇̔̀̅̉̇̉̄̉̓̋̎̓̓̆̿̃͊̇̓́͌̾͛͊͑̈́͆͆́͆̌̓͛̆͆̉̿̔̍̂̓͊͑̄̀̀̀̈́́͊̆͆̔̄̌̉͂̎̈́̈͗̈̌̍̈́͌̈̈́̆̑͊̂͊͒̍̍͗͛́̔̓̅̑͐́́͋͒̐̒̍͛̋̇̍̋͛͛̈̌͐̏͌͐̐͊͐͛̀̃̿͑͂͑̎͌̏͒̈́̎̔̿̔̓͗̉̓́̈̉̉̈́̎̅̑͂̀͋͑̄͌̎̂̇́̈̓̽̄̿͂̈̒̍͆̎̄̈͐̈́̌͋̏̉̏́́̈́̿͗̿́̊̈̄̀̿̆͌̓̇̽̏̍͑͆͋̿̍̋̑̀̽̅̎̍̐̉́̐̆̆̒̈́̉̏̚͘̚̚͘̕̕̕͘̕̕̚͜͝͝͠͝͠͝͝͠͠͝͝͝͠͝͠͝Ơ̸̧̢̢̢̨̡̧̨̨̡̡̢̢̧̧̢̤̱͇̣̺̰͚̙̗̦̗̜͈͔͓͚̦̲̹͚͕̗͙̖̻͔̻̱͖̦͈̙̪̩͉͎̤͍̟̻̗̺̺͇̻̩̳͙̜̖̳͈͙̫̬͉̪̦̻̩̰̦̮̘͎̳̞̤̯̼͈̩͕͉̱̝̻͍̯̩̠̹̝̙̭̯̖̣̲̹̻̠̰̗̠̟̲͔̺̥͎̯̳͎̮̣̳̭̩̦͖͇̹̳̪͚̳̳̼̘̝̠̙̦̘̩͍͒͐͑͂̅̽͊̎̇̄̌̃̓̃͂͌̐̉̃̊̏̐̀̍͛́͊̎̌̓̅̇́̓̈́͂͛̓̉͑͑́̽̎̆̈́̉̍͆̎̿͘̚͜͜͜͝͝ͅͅͅV̵̢̡̨̡̢̡̢̧̡̨̡̡̢̡̢̡̧̧̧̢̧̢̧̧̢̡̡̢̧̡̡̢̛̛̛̹̙̞̜͉̗̩͓̟͚̬͖̻̤̬̰̯̥̪͍͙̻̝͖̳̫͓̖̞͚̻̪̬̩̬̲̖̺͖̝̘̖̫̳͔̼̫̝̳͎͎͍͓̪̪̙̯͖̣̥͈̭̜̝͍̱̼͕̜̟̗̜̮̝͓̫͖̮͚͓̤͎̫͈͇̫̹̮̗̟̦̲͚̤̣͙̣͈̭̳̱̱͎͖̟͉̠̮̤̭̳͙͍͕̺̣̺̣̭̣̭̟̤̯͖̗̗̖̭̲͎͖̯̫̹͎͍͎̤̳͖͓̟̠͙͚̗̤̳̟̪̰͖͖̟̩̜̼̝͚̭̣̪̦̪̰̹͕̫͕͓̤̲̮͔̦̩̼͎͉̬̘͍̠̪̮̻̩̰̠͙̙̗̖̱̳̤̥̳͈̮̗͕̗̻̪͚̟̟̱͎̼̲̩̘̣̣̞̈́̿̀̽̊̓̔̑̐̇̍̽̊͂̓͑͑̈̌́̄̿̓̃̋̄́̐̒͌͋͌̄͋͆͋̎̅͑̋̔̐͌̌͊̀̐̀͋̔̿̓̋̈́͌͗̎̔̊̓͗̃͆̄̽̅͗͗̅̏̌́̓͋̓̅̑̉͑̽̄̄̌̍̓̆̇̽͐͐̐́̌́̅͛̍̂̊̌̄͗̊̔͗̾̾̓̊̀̄̍̇̄̂̏̈̆͑̊̓͐̂́̂́͂͋̍̈̄̀̂̇̐͊̒͛̌͋̊͛̊͆̔̏́͐̐̌̋̑̏͆̎̈̈̈́̏̿̋̔͌́̒͂͛̾̑̅͋͗̽̽̈̑̈́̍͛͌͐̍̆̀͊̓͐͒̅̅͐͆̈́̈̄̐̑̒̑̀̉̃͑̑̒͗̇́̇͐͌̀͗͒͌́̾͛̉̽̿͋͑̆̌̚͘̕̕̕͘̕̚͘̕̚͘̕̚͘͜͜͜͜͜͜͜͜͝͝͠͝͠͝͠͝͝͝͝͝͝͝͝͝͝͠͝ͅͅͅͅͅͅͅͅE̷̡̡̨̢̧̡̡̨̨̨̨̧̡̢̡̢̡̧̢̢̡̡̧̡̨̢̛̛̙̞͈̬͇̜̫̪̫͔͉͙̭̯̗̟̤͎̪̟̼̳̟̗̫̰̟͎͚͈͇̰̬̝̹̰̩̘̬̠̥̦̬̜͙̩͈̺̻̩̘̗̬̣̟̻̗̭͎͎̘̹̰̦̪̖͔̭͖̖̦̣̥̭̜͓̯̥͓̤̻̺̬͚̝͈̼̤̙̻͇̮̟̳̟̞͖̥̰͎̬̞̱̼͓̪̰̜̰̦͇͔̭̰̼̜͍̭̜͉̦̞̻͚͔̣̗̖̗̗̥͔̪̤͖̻̪̹̭̫̯̘̗̫̣̲̲̘͕̝̞̹̖͍͎̟͈͙̼̟̲̘̪̗̠̥͉͎̯̳̰̞̪͙̮͚̦̼͕̹̬̣͂́͌̽̀̒͒͑̌͑̑͌̊̎̈́̆̇̈́̒͌̔̒̏͐͒̀̉̀̇̄̂̉̈́̈́͊̅̈́͑̊̅̐̽̎͐̇͆̋̆̐̔͆͆̔̀̔̄̍́͌͋͋̎̾̃͊̓̌̅̋̋̈́͒͂̀͌̏̄̓͑̉͆̈́͒̈́̊̀̋̎̄̿͐̈́͊́̐̑͐͑̈́̒͒̍̿̍̎͗̽̀̓̒̀̉͌̎̓͗̋͑͆̇̏͆͗̔̎̈͗̿̽̅͗͐̇̆̈́͋̏̍͂̇̍͗́̎͗͒̐̈͐̆̀̉͊̈́̀͌̃̈́̎̈́̒͋̿͌̈́͗̿̐̊͗̋̌͗̕̕̕͘̕͘̚͘͘̕͘͜͜͜͜͜͜͜͠͠͝͝͝͝͠͝͝͝͝͝ͅͅͅͅͅͅṘ̴͎͚̻̣͖̰̝͔͔̲̞̭͙̊̓͗̊͛̑̓̆̍͐̍̾͂͒́̓̔̄̂̈́͘̚̕͠͝͠ͅ ̴̨̛̛̛̛̛̛̹̳̟̻̄̉̏͋͛̓́̀̐̇̐́̎̓̃͒͂̎̄̈́̒͐̒͆̇̉̄͑̅̈̍̆͂̿̄̒̌̊̂̇͂͗̑̏̂̏͋̀̂̈́̓̀̑̎̎͌̋̄̽̊͗̎͌́̒̏̔̾̆̀̇̀́͂̀͋́̍̽͗̒͐͊͑̈͗̋́͋̆͆͋̆̉̑͛̈́̉͑̊͐͂̄̄́͛̎̓͛͗̓͑̉̉̎͛̀̐̽͂̍̀̾͗̂̊͌̀͌̇̉́͒̓̐̃̂͋̽̈́̋̓̊̈́́̀̿͋̌̑̇̃̋͋̈̍͑̓̿͋͋̉̌͋̊̈́̌͑͂͆̆͐̀̈̈̌̌̃̃̉̈́̅̆̎̓̊͊́̀̕̚̚̚͘͘͘̚̕̚̚͜͠͝͠͝͝͠͝͠͝͝͝Ŗ̶̡̛̛̛̘̭̬̱͔̬̯͕͓̳͙̭̳̫͉͇̩̪͉̺̯͙̬͎̠̩͎͖͈͕̽̀̈͐̈́͛̾͂̓̈̋̆͌̀̐͗͊̈͗̾́͊̈̌̽̔́̍̀́̏̀̈́̽̓͑̓́̑͆͛̿̉̌͂͑̓̅̊͌̄̊̑̑͛̍̀̆͂̊̚̕̕͘̕͘͝͝͝͝͝͠ͅͅĄ̶̛̛̱͙̗͔̲̬̬͙͕̳̩̟͙͖͖͉̲͙͈̖̩̗̭͑̄́̓̾̀͊͛͊̅̏͋́̓͑̔̈͗̒̓̔̆͒͗̓̓͐̆̊̊̓̈̔̈͛̈́͛̏̄̓͛̓̓̈́͋͒̓̋̓͌̆͛͒́̎͒̏̄̅̀̒͛͆̃̈̈́͊̀̐̇̑̍̀̊͂̍̋͗̒̈́͗͂̓͗̇̌̆̋͑͛̆̐́̀̎̄̈͛͗̽͗͂͌͗̀̏͌̋̉͌̾͆́́̾́̆̎̀̈́̾̃̉̓͂̍̔̄̉͛̈́͒̈͐́̎̿̂̐̀̊̊̀̆̌̓͋̓̔͗̿͋̽̉̀̾̈̈̇͌̐͌̋̋̒̈́͆̆͌̇̈́̒͒͒̈̕͘̚̚͘̚͘̚̚͘͘̚͜͝͠͠͠͝͠͝͝͝͝͠͝͝͝͠͠͝ͅT̵̡̢̡̨̡̨̢̨̡̧̨̛̛̛̛̛̘̗͔̣̮̰̭̯͓͉͍̹͔̘̠̠̱̫̮͈̩̣̺̭͇͇͚̻̼͖͙̲̭̤̗̯͍̺̻̞̯̖͓̼̮̝̗̦̯̩̲̱̖̤̩̙̫̞͙̮̜͇̠͖̥̹͓̟͓̪̮͒͆̄̈̑̀́̈́̆͒̊͛̐͌͛̔̃̀̓̒̎̋̍̉̓̄͋̀̂̏͑̑̿͌̆̾͒̒̍͑̽̌̍̉̋̽̅̎̈̑̄͆̽̔̈́̈̄̔̊͊́̃́̈̓̂̓̇̈́̎̅̊́́͋̌̎͂̀̇͐̓̌́́̐̈́̓͛̄̌̇́̈̑̔̇̅͗̋̈͐̎͌͊̓̀̑̐̈͛̉̉̀͛̈́̇̔̐̿̈̋̀̋̂͊̒̀̕̕̕̚͜͜͜͝͠͝͝͝͠͝͝͠͝͝ͅͅͅT̸̡̡̧̡͎̬͉͈̳̘̠̲̼̻̰͈͚̩̥̮̬̤͙̩̜̼̝̮̞̦͉̬̤̗͇̳͔̹̝̳̩̫͕̫͍̣̻̺̩̘̹̑̊͑̇̄̋̐̑͒͛́̀̀̀̊̆͊͐͛̑̈́̈́̄̿́̅͂͛́̈́̄̔̇̿͐̃͘͜͜͝͠͝͠͝͠ͅͅͅͅͅL̷̡̡̧̨̢̧̢̢̧̧̨̨̡̢̡̧̧̻͇̲͈̤̗̳̲͉̹͚͚͚̖̳͍͎̰̞̳͉̮̲͕͓͓̪̞͉̼͖͕̣̫̟̲͇̲͙̞̰̻̺͉̻͍͕̱̣͓̭̮͉͍͕͓̞̪͔̞͖̮̗̬̦̹̜̭̥̲̩̘̥̞͈̯̞̫̬͍͓͈̲̪̼̺͙̳͙̻̼̙̮̯̳̬̤͓̰̜̘̲̟͍͖̼̟̥̳͕̺̖̭̺͓̘̣͕̻̞̗̠̲͚̥̙̪̫͍̝͔̙̹͎̪͖̻͙̣͇̜̲̯̝̘̞̪̜̺̲͕̥̖̻̻̘͚̥̳̟̘̠͍̪͙̞͓̗͉͕̺̝͙̙̙̳̙̈́̇̀̇͐͂͜͜͜͜͜͜ͅͅͅͅͅͅE̵̢̛̛̛̛̛̠͖̩̰̖͎̱̖̠̥̤̤͆̾̀͊̍̋͐̒̀̾̄͊̆͆͌͆̂̌͊̒̽͆̈́̒̇̋̐͛͋͐̾̒̌̈͑̆̌̒̀̎̍͒̀̓̿͐̉̇́̔̌̄͊́̄̈́͊͋̀̆̌̍́̈́̿̄́͌̆̅̊̈́̔̀͌̿͂̏̎̓̀̐̅̂̈́̽̋̇́̀̾̀̆̎͆͗̽͑͐́̇̂̒̅̅́̋͊́͆̂̉̾̈̒̽̆̋̏̎͂̀͋͆̊̃̂̽̎̌̄͂̌̈́̐̉̋̌̒̋͊̿͛͌̈́̌̑̅̓̈́̓́̓̃̐̽̒̓̈͂̔́̀͒́̇̔̓͐̇͒͌͊͗̓̊͐̀̋̉̓̀̾̾́̍̓̿̍̌͌̋͌̓̒́͌̑̀͒͊̎͗̈́͗́̅͛̀̔̈́̄̚̕̕̚̕͘̚͘̕̕̚̕̕̚̚̚̕͘͜͜͝͝͝͠͝͝͠͝͠͠͝͠͠͠͝͠͝ͅ");
	   
	   
   }
   
   public String processText(String userText)
   {
	   String output = "";
	   
	   output += "you said: " + userText;
	   
	   return output;
   }
public boolean spookyChecker(String Checker)
{
	// TODO Auto-generated method stub
	return false;
}
public boolean legitimacyChecker(Object object)
{
	// TODO Auto-generated method stub
	return false;
}
public boolean contentChecker(String content2)
{
	// TODO Auto-generated method stub
	return false;
}

}

   
