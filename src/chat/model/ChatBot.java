package chat.model;
import java.util.*;

import javax.swing.JOptionPane;


public class Chatbot 
{ //Data Members
    private static final String String = null;
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
   public Chatbot ()
   {
	   this.joke = "why cant dinosuars drive? they are all dead";
	   this.currentUser = new String("Default");
	   this.content = new String("notin");
	   
	   this.responseList = new ArrayList<String>();
	   this.spookyList = new ArrayList<String>();
	   
	   
	   buildTheLists();
   }
   public Chatbot(String sampleContent)
{
	this.content = new String("sample content");
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
	   
	   
	   spookyList.add("Halloween");
	   spookyList.add("Halloween is the worst holliday " );
	   spookyList.add("*rattles quietly");
	   spookyList.add("rattle me bones take what you will but dont rattle me bones");
	   spookyList.add("r̴͉̄̽͗̚a̸̧̧̘̺͚̯̙̳̜̝͖̲̿̍̒̉́͊̓͒͜͝ͅţ̸̲̳̪̟̊̏͘͘͜t̸̡̧̛̼̫̗͓̰̬͚̫̓̂̇͌́̍͝ͅl̶̛̯̖͍̯͈̺͔̏͐͊̑̉̅͛͛́̍͝͝ẻ̵̳̤̭͋̉̐̾̾̋̆͛̇͌͘̚͝ͅ ̶̢̗͖̌͆̅̾̀̚͜͝m̸̮̹͓̜̐͑̽̓ë̵̛̟̟̥̫̻̫̯́̏̀̐͋͝ ̸͚̥̳́̂͐̓͒̏͋̔̅̃̂̑́̕͝b̸͉̺̱̖͖͚̥͔͕̀́͌̎́̓́o̸̡̨̜̜̰͇̙̦̦̳̠͎̼̦̫̿͌̄̐̑̀̕͠n̴̤͓̘̬͙̠̟̖̜͂̍̋̈́̄̉͊̄̈́̍̅̅͘̚͠ė̴̛̝̙̫̲̞̲͇͖̪͉̭͈̩̼̋͐̂͌͊̑̈́̐̀̿͐͝s̵̹̬̳̮̓͌̏̇̈͆͑̽̒͆͘͝͠");
	   spookyList.add("M̸̧̧̧̢̨̧̨̧̨̡̧̡̢̢̨̧̡̨̧̢̨̧̢̢̢̡̢̢̨̢̨̛̛̛̛̦̥͓͙̠̯̬̦͎͚͔̝͕͉̘̮̩̯̜͕̗͈̟̜͖̱͉̞̭̟̮̗͎̪̳̫̻̜̘͍͉̝͕͉̗̰͙̠͔̼͔̲͉͇͖͓̟̤̺̱̩̗͖͖̲͍̮̹̖̻͎̣̺͈͎̭̲͔̜̻̥̹͖̲̫̩̗̬̯̠͕̜͎̩̰̭̼̥̙̳͔͕̲͚̤͉̮̤͖͕̹͎͕̩̱̲͙̩̖͓̝̞̹̟̭͓͍̤̣͕͈̬̣̮̞̺̻͚͎̤̪͔͉̗̼̭̦̼͕̼͖̻̥͓̰̳̫̻̮̬̝̩͍̣͇͍͔̺̳̠͚͈̹͈̠̥͍̦̯̺̬̱͚̳̱̦̱̙̦̞̗̽͆̒̔͊̈̿͒̌̈́͌̎̈́͋̏̀̒̀̅̍̈́͌̋̎̈̀͋̀͆̏̆̐̓̾̐̑͆̊̈̓̇̎̑̔̍͗̐̑̀̇͆͆̌̃̈́͆̎̂̃̏͂͋̽̐̉̂̔͛̍̀̾͌̔̑̐͐̋̍͑͗̓̀̊́̀͋̍̏̑̏́̿̀̆̆̍̒̿̈͗̎́̊̽̀͑͆͌̄͛̑͂̎́̂͋̌́̃͊́̑͆̀̋̉̍͒͛̈́̈́͑̑͊̇͐̅̐͊̂̂͌̌̐̆͑̂̆̋͐͑̀́̃̉̈̇̌͂̉́̄̌͘͘̕̚̚̚͘̚̚̕̕̚͘͘̚̕͜͜͠͝͝͝͝͠͝͠͠͠͝͠͝͠͠͝͝͠͝͝͝ͅͅͅͅͅͅͅA̷̧̢̢̢̨̛̛̛͙͓̩̜̬̭̱̯̮̭͍̣̹̦͓̥͙̯̲͓̭͍̍̇̔̈́̈̾̈̎̃̉̃̀͛͌͑͛̿͑̉̀͗̃̓̀͛̓͒̅͒̿̏̈́́͐͒̐̎̎́̿̏́́͒̆̓̌̋͋̃̍͗̓͐̍̍̈́̔͌͋͒̾̍̿͑͗̂̆̂͑̆̔̃̓͌̃̅̿͊̎̽̊͑̔͛̈̓́̀̐̽́̈́̀̀͑̇̓͂̈́̉̈̒̌͋͐̍̾̾̀͛̊̋̾́̔̏͗̇̆̊̋̀̆̍̀͌̎̅̅̃̈́̐̂̓̀͐̈͛́͋̀͊̾́̍͛̏͛̊͆̉̾͐̚̚̕̚̕͘͜͜͠͝͝͝͠͝͝͝͝͠͝͝X̵̧̛̛̛̛͙͉̯̫͍͙͇̙̲̹͎̬͙̺̟̞͎̐̇͂̽̏̎̓͒̅̃̂̿͊̎̿̀̽́̐̓͋̿̌̉̇͒̀̓̆̀̈́͒̃͋̆̃͋̊̒̂̑̎͋͗̀̈̓̈́̃̋̃̽̐́́͐̀͊̊͐̏́͛̉̓̊̃́̄͒̊͆̑̓̀̆̿̆͋̋́͌̔̅͒̅͑͑̔̌̌͂́̑̒̆̈́̈́̆̉́̌̈̋̍̂̕͘̕̚͘̕̕̚̕͘͘̚͘͝͝͝͝͝͠͠͠͝͠I̵̧̢̨̢̡̛̛̛̛͙̼̮̗͇̹͚͔̲̜̯͎̲̟̭̪̤̜̟̜͉̥͉͈̺̞̻̠̤͕̫̯̰̝̣̤͖̗̰̻̻̜͈̱͕̱̙͙̭͖͎͚̔́̾̒̉̌̈̈́̃̋͐̓̀̃̂̌͂͋̅͐̅̾͋̍̍̔̓͊̂̇̔̊̑͋̏́̅͊̐̉̀̽͆͒͂̈̊͂̽̔̎́̀͆̈͗͒͂̉̃͋͗̾͂͗̋̍̓̉̓̈́̄̈́̋̆̅̑̽́͆̎́̈́́̈̃̿̎͗͒̀̄͗̽̾̂̀͌̒͛̏̈́͂̈́͑͋͛̈͑͂̋͋̇̋͂͒̑̂̈͋̅̿͋̽̀̿͐̒̅͒͐̒̓̍̐̈́̅̓̇͊͆̔̈́̆̓̑̌̀̉͌̌̈́̄͋̇̒͒͐̐̅́̾̀̈́̓̇̔̆͋͊̓́̍̈́̑̆̃̿̌͗̀͗͆̉͆̈͆̉̄͑̈́̈͒̊̾̉̿͊̅̿̾͆̓͆͊̐̕̕̕̕̚͘̕̚͜͜͠͝͝͝͝͝͝͠͠͝͝͠͠͠͝͝ͅͅM̸̧̧̺̖̘̝͖̜͚͉̦͖͈̤̭̺̭̝̭̬̯͈̙̼̫͕̱̀̈͊͋̈̈́͆̾̈̔̈́̍̎̽̋͗͊̒̓̑͑̇́̓̈̎̾̇̓̑̓̓̂̉̅̑̉̀̀̀̓̍̍̋̏͐̕͜͝͝͝͠͝͝͠͝͝͝ͅŲ̷̧̛̛̛̛̛̜̫̗̤̻̰̳̺̪̲͎͕̖̻̥̩͙̮̥̳͈͍͙͔̯̞̞͕̲̖̲̣͕̜͔̬̪̰͎̼̳̘͔̞͙͌͌̀̊͐̾̿̈̀̓̑̾̃͛̂͂̽̋͂̀͌̓̂͑̾͆͋̎̇́͋͂̑̃́̇̈̓̈́̀̽͛̈́̉̒͐̈́͆̓̒̀̀̀̌̀̀͋͑̀͗̍̄̃̃̋̾̓͛̓́̈̔͛͌͂͌͂̔̊͋̿̿̄͌͊̍̏͑͌͌̿͛̊̈̆̋͑̽͐̎̒̐̈͒͊̀̐̈́̑̈́̉̽̽̓̒͛͑͒͐̾̾͐̈̃̽̓̎͐͌̉̽̋̏̌̅̔̀̅͌̎̀̄̋͒̒̍̀̐́̊̋̀̃̽̃͑̊́̓̿̆̔̀͋̽͒͋́̽̐͗̐̊̉̈͐̃̇̏́̍̐̽̌̏̏̎̎͂̿̊̑̍̾̕͘̕̕̕̕̚̚̚̕͘͝͝͝͠͝͝͠͝͝͝͠ͅͅM̸̧̡̨̡̧̢̢̡̨̛̛̹̟̺͙̜̭̼̬̙̱̻̠̣̱͕̗̹͍̖̝̩͎̲̭͙̥̯͙͖͉͖͉̳͙̗̞͍̻̳͍͕̘̱͙̫̯̯͚̠̗̠̒̒͐̽̽̓̄̽͌̍̎̈́̑͛̀̓̐́̆̇̐̔̄̏̀̾͗̂̀͒͐́̉̾̒̈́̀̄̊̈́̐̄̈̐͛͒̈̔̍̏̌̀̎̆͛̓͂͐̑̉̍̒̇͑̍͐͆́̀̈́͒̌̒͊̃͋̃̊̔́̿̐̓̈́̎̈́̇̇̽̎̈̔̔̔́̚͘͘͘̚͜͜͝͝͝͠͝͝͝͝͠ͅ ̸̨̨̛̛̛̛̛̛̛̮̣̝̳̗̗̼̘̮̣̞͕̤̀̿̉͋̾̊̎͛̏̇̅̂͐͑͌͐̆̐̈̀̀̈́̇̂͒͑͗̎̂̋̇̔̀̅̉̇̉̄̉̓̋̎̓̓̆̿̃͊̇̓́͌̾͛͊͑̈́͆͆́͆̌̓͛̆͆̉̿̔̍̂̓͊͑̄̀̀̀̈́́͊̆͆̔̄̌̉͂̎̈́̈͗̈̌̍̈́͌̈̈́̆̑͊̂͊͒̍̍͗͛́̔̓̅̑͐́́͋͒̐̒̍͛̋̇̍̋͛͛̈̌͐̏͌͐̐͊͐͛̀̃̿͑͂͑̎͌̏͒̈́̎̔̿̔̓͗̉̓́̈̉̉̈́̎̅̑͂̀͋͑̄͌̎̂̇́̈̓̽̄̿͂̈̒̍͆̎̄̈͐̈́̌͋̏̉̏́́̈́̿͗̿́̊̈̄̀̿̆͌̓̇̽̏̍͑͆͋̿̍̋̑̀̽̅̎̍̐̉́̐̆̆̒̈́̉̏̚͘̚̚͘̕̕̕͘̕̕̚͜͝͝͠͝͠͝͝͠͠͝͝͝͠͝͠͝Ơ̸̧̢̢̢̨̡̧̨̨̡̡̢̢̧̧̢̤̱͇̣̺̰͚̙̗̦̗̜͈͔͓͚̦̲̹͚͕̗͙̖̻͔̻̱͖̦͈̙̪̩͉͎̤͍̟̻̗̺̺͇̻̩̳͙̜̖̳͈͙̫̬͉̪̦̻̩̰̦̮̘͎̳̞̤̯̼͈̩͕͉̱̝̻͍̯̩̠̹̝̙̭̯̖̣̲̹̻̠̰̗̠̟̲͔̺̥͎̯̳͎̮̣̳̭̩̦͖͇̹̳̪͚̳̳̼̘̝̠̙̦̘̩͍͒͐͑͂̅̽͊̎̇̄̌̃̓̃͂͌̐̉̃̊̏̐̀̍͛́͊̎̌̓̅̇́̓̈́͂͛̓̉͑͑́̽̎̆̈́̉̍͆̎̿͘̚͜͜͜͝͝ͅͅͅV̵̢̡̨̡̢̡̢̧̡̨̡̡̢̡̢̡̧̧̧̢̧̢̧̧̢̡̡̢̧̡̡̢̛̛̛̹̙̞̜͉̗̩͓̟͚̬͖̻̤̬̰̯̥̪͍͙̻̝͖̳̫͓̖̞͚̻̪̬̩̬̲̖̺͖̝̘̖̫̳͔̼̫̝̳͎͎͍͓̪̪̙̯͖̣̥͈̭̜̝͍̱̼͕̜̟̗̜̮̝͓̫͖̮͚͓̤͎̫͈͇̫̹̮̗̟̦̲͚̤̣͙̣͈̭̳̱̱͎͖̟͉̠̮̤̭̳͙͍͕̺̣̺̣̭̣̭̟̤̯͖̗̗̖̭̲͎͖̯̫̹͎͍͎̤̳͖͓̟̠͙͚̗̤̳̟̪̰͖͖̟̩̜̼̝͚̭̣̪̦̪̰̹͕̫͕͓̤̲̮͔̦̩̼͎͉̬̘͍̠̪̮̻̩̰̠͙̙̗̖̱̳̤̥̳͈̮̗͕̗̻̪͚̟̟̱͎̼̲̩̘̣̣̞̈́̿̀̽̊̓̔̑̐̇̍̽̊͂̓͑͑̈̌́̄̿̓̃̋̄́̐̒͌͋͌̄͋͆͋̎̅͑̋̔̐͌̌͊̀̐̀͋̔̿̓̋̈́͌͗̎̔̊̓͗̃͆̄̽̅͗͗̅̏̌́̓͋̓̅̑̉͑̽̄̄̌̍̓̆̇̽͐͐̐́̌́̅͛̍̂̊̌̄͗̊̔͗̾̾̓̊̀̄̍̇̄̂̏̈̆͑̊̓͐̂́̂́͂͋̍̈̄̀̂̇̐͊̒͛̌͋̊͛̊͆̔̏́͐̐̌̋̑̏͆̎̈̈̈́̏̿̋̔͌́̒͂͛̾̑̅͋͗̽̽̈̑̈́̍͛͌͐̍̆̀͊̓͐͒̅̅͐͆̈́̈̄̐̑̒̑̀̉̃͑̑̒͗̇́̇͐͌̀͗͒͌́̾͛̉̽̿͋͑̆̌̚͘̕̕̕͘̕̚͘̕̚͘̕̚͘͜͜͜͜͜͜͜͜͝͝͠͝͠͝͠͝͝͝͝͝͝͝͝͝͝͠͝ͅͅͅͅͅͅͅͅE̷̡̡̨̢̧̡̡̨̨̨̨̧̡̢̡̢̡̧̢̢̡̡̧̡̨̢̛̛̙̞͈̬͇̜̫̪̫͔͉͙̭̯̗̟̤͎̪̟̼̳̟̗̫̰̟͎͚͈͇̰̬̝̹̰̩̘̬̠̥̦̬̜͙̩͈̺̻̩̘̗̬̣̟̻̗̭͎͎̘̹̰̦̪̖͔̭͖̖̦̣̥̭̜͓̯̥͓̤̻̺̬͚̝͈̼̤̙̻͇̮̟̳̟̞͖̥̰͎̬̞̱̼͓̪̰̜̰̦͇͔̭̰̼̜͍̭̜͉̦̞̻͚͔̣̗̖̗̗̥͔̪̤͖̻̪̹̭̫̯̘̗̫̣̲̲̘͕̝̞̹̖͍͎̟͈͙̼̟̲̘̪̗̠̥͉͎̯̳̰̞̪͙̮͚̦̼͕̹̬̣͂́͌̽̀̒͒͑̌͑̑͌̊̎̈́̆̇̈́̒͌̔̒̏͐͒̀̉̀̇̄̂̉̈́̈́͊̅̈́͑̊̅̐̽̎͐̇͆̋̆̐̔͆͆̔̀̔̄̍́͌͋͋̎̾̃͊̓̌̅̋̋̈́͒͂̀͌̏̄̓͑̉͆̈́͒̈́̊̀̋̎̄̿͐̈́͊́̐̑͐͑̈́̒͒̍̿̍̎͗̽̀̓̒̀̉͌̎̓͗̋͑͆̇̏͆͗̔̎̈͗̿̽̅͗͐̇̆̈́͋̏̍͂̇̍͗́̎͗͒̐̈͐̆̀̉͊̈́̀͌̃̈́̎̈́̒͋̿͌̈́͗̿̐̊͗̋̌͗̕̕̕͘̕͘̚͘͘̕͘͜͜͜͜͜͜͜͠͠͝͝͝͝͠͝͝͝͝͝ͅͅͅͅͅͅṘ̴͎͚̻̣͖̰̝͔͔̲̞̭͙̊̓͗̊͛̑̓̆̍͐̍̾͂͒́̓̔̄̂̈́͘̚̕͠͝͠ͅ ̴̨̛̛̛̛̛̛̹̳̟̻̄̉̏͋͛̓́̀̐̇̐́̎̓̃͒͂̎̄̈́̒͐̒͆̇̉̄͑̅̈̍̆͂̿̄̒̌̊̂̇͂͗̑̏̂̏͋̀̂̈́̓̀̑̎̎͌̋̄̽̊͗̎͌́̒̏̔̾̆̀̇̀́͂̀͋́̍̽͗̒͐͊͑̈͗̋́͋̆͆͋̆̉̑͛̈́̉͑̊͐͂̄̄́͛̎̓͛͗̓͑̉̉̎͛̀̐̽͂̍̀̾͗̂̊͌̀͌̇̉́͒̓̐̃̂͋̽̈́̋̓̊̈́́̀̿͋̌̑̇̃̋͋̈̍͑̓̿͋͋̉̌͋̊̈́̌͑͂͆̆͐̀̈̈̌̌̃̃̉̈́̅̆̎̓̊͊́̀̕̚̚̚͘͘͘̚̕̚̚͜͠͝͠͝͝͠͝͠͝͝͝Ŗ̶̡̛̛̛̘̭̬̱͔̬̯͕͓̳͙̭̳̫͉͇̩̪͉̺̯͙̬͎̠̩͎͖͈͕̽̀̈͐̈́͛̾͂̓̈̋̆͌̀̐͗͊̈͗̾́͊̈̌̽̔́̍̀́̏̀̈́̽̓͑̓́̑͆͛̿̉̌͂͑̓̅̊͌̄̊̑̑͛̍̀̆͂̊̚̕̕͘̕͘͝͝͝͝͝͠ͅͅĄ̶̛̛̱͙̗͔̲̬̬͙͕̳̩̟͙͖͖͉̲͙͈̖̩̗̭͑̄́̓̾̀͊͛͊̅̏͋́̓͑̔̈͗̒̓̔̆͒͗̓̓͐̆̊̊̓̈̔̈͛̈́͛̏̄̓͛̓̓̈́͋͒̓̋̓͌̆͛͒́̎͒̏̄̅̀̒͛͆̃̈̈́͊̀̐̇̑̍̀̊͂̍̋͗̒̈́͗͂̓͗̇̌̆̋͑͛̆̐́̀̎̄̈͛͗̽͗͂͌͗̀̏͌̋̉͌̾͆́́̾́̆̎̀̈́̾̃̉̓͂̍̔̄̉͛̈́͒̈͐́̎̿̂̐̀̊̊̀̆̌̓͋̓̔͗̿͋̽̉̀̾̈̈̇͌̐͌̋̋̒̈́͆̆͌̇̈́̒͒͒̈̕͘̚̚͘̚͘̚̚͘͘̚͜͝͠͠͠͝͠͝͝͝͝͠͝͝͝͠͠͝ͅT̵̡̢̡̨̡̨̢̨̡̧̨̛̛̛̛̛̘̗͔̣̮̰̭̯͓͉͍̹͔̘̠̠̱̫̮͈̩̣̺̭͇͇͚̻̼͖͙̲̭̤̗̯͍̺̻̞̯̖͓̼̮̝̗̦̯̩̲̱̖̤̩̙̫̞͙̮̜͇̠͖̥̹͓̟͓̪̮͒͆̄̈̑̀́̈́̆͒̊͛̐͌͛̔̃̀̓̒̎̋̍̉̓̄͋̀̂̏͑̑̿͌̆̾͒̒̍͑̽̌̍̉̋̽̅̎̈̑̄͆̽̔̈́̈̄̔̊͊́̃́̈̓̂̓̇̈́̎̅̊́́͋̌̎͂̀̇͐̓̌́́̐̈́̓͛̄̌̇́̈̑̔̇̅͗̋̈͐̎͌͊̓̀̑̐̈͛̉̉̀͛̈́̇̔̐̿̈̋̀̋̂͊̒̀̕̕̕̚͜͜͜͝͠͝͝͝͠͝͝͠͝͝ͅͅͅT̸̡̡̧̡͎̬͉͈̳̘̠̲̼̻̰͈͚̩̥̮̬̤͙̩̜̼̝̮̞̦͉̬̤̗͇̳͔̹̝̳̩̫͕̫͍̣̻̺̩̘̹̑̊͑̇̄̋̐̑͒͛́̀̀̀̊̆͊͐͛̑̈́̈́̄̿́̅͂͛́̈́̄̔̇̿͐̃͘͜͜͝͠͝͠͝͠ͅͅͅͅͅL̷̡̡̧̨̢̧̢̢̧̧̨̨̡̢̡̧̧̻͇̲͈̤̗̳̲͉̹͚͚͚̖̳͍͎̰̞̳͉̮̲͕͓͓̪̞͉̼͖͕̣̫̟̲͇̲͙̞̰̻̺͉̻͍͕̱̣͓̭̮͉͍͕͓̞̪͔̞͖̮̗̬̦̹̜̭̥̲̩̘̥̞͈̯̞̫̬͍͓͈̲̪̼̺͙̳͙̻̼̙̮̯̳̬̤͓̰̜̘̲̟͍͖̼̟̥̳͕̺̖̭̺͓̘̣͕̻̞̗̠̲͚̥̙̪̫͍̝͔̙̹͎̪͖̻͙̣͇̜̲̯̝̘̞̪̜̺̲͕̥̖̻̻̘͚̥̳̟̘̠͍̪͙̞͓̗͉͕̺̝͙̙̙̳̙̈́̇̀̇͐͂͜͜͜͜͜͜ͅͅͅͅͅͅE̵̢̛̛̛̛̛̠͖̩̰̖͎̱̖̠̥̤̤͆̾̀͊̍̋͐̒̀̾̄͊̆͆͌͆̂̌͊̒̽͆̈́̒̇̋̐͛͋͐̾̒̌̈͑̆̌̒̀̎̍͒̀̓̿͐̉̇́̔̌̄͊́̄̈́͊͋̀̆̌̍́̈́̿̄́͌̆̅̊̈́̔̀͌̿͂̏̎̓̀̐̅̂̈́̽̋̇́̀̾̀̆̎͆͗̽͑͐́̇̂̒̅̅́̋͊́͆̂̉̾̈̒̽̆̋̏̎͂̀͋͆̊̃̂̽̎̌̄͂̌̈́̐̉̋̌̒̋͊̿͛͌̈́̌̑̅̓̈́̓́̓̃̐̽̒̓̈͂̔́̀͒́̇̔̓͐̇͒͌͊͗̓̊͐̀̋̉̓̀̾̾́̍̓̿̍̌͌̋͌̓̒́͌̑̀͒͊̎͗̈́͗́̅͛̀̔̈́̄̚̕̕̚̕͘̚͘̕̕̚̕̕̚̚̚̕͘͜͜͝͝͝͠͝͝͠͝͠͠͝͠͠͠͝͠͝ͅ");
	   spookyList.add("Spooky scary skeletons\n" + 
	   		"Send shivers down your spine\n" + 
	   		"Shrieking skulls will shock your soul\n" + 
	   		"Seal your doom tonight\n" + 
	   		"Spooky scary skeletons\n" + 
	   		"Speak with such a screech\n" + 
	   		"You'll shake and shudder in surprise\n" + 
	   		"When you hear these zombies shriek\n" + 
	   		"We're so sorry skeletons\n" + 
	   		"You're so misunderstood\n" + 
	   		"You only want to socialize\n" + 
	   		"But I don't think we should\n" + 
	   		"Cause spooky scary skeletons\n" + 
	   		"Shout startling shrilly screams\n" + 
	   		"They'll sneak from their sarcophagus\n" + 
	   		"And just won't leave you be\n" + 
	   		"Spirits supernatural\n" + 
	   		"Are shy whats all the fuss\n" + 
	   		"But bags of bones seem so unsafe\n" + 
	   		"It's semi-serious!\n" + 
	   		"Spooky scary skeletons\n" + 
	   		"Are silly all the same\n" + 
	   		"They'll smile and scrabble slowly by\n" + 
	   		"And drive you so insane\n" + 
	   		"Sticks and stones will break your bones\n" + 
	   		"They seldom let you snooze\n" + 
	   		"Spooky scary skeletons\n" + 
	   		"Will wake you with a boo!");
	   spookyList.add("your really breaking my bones lad");
	   spookyList.add("are we cool yet?");
	   spookyList.add("Ḇ̷̡̡̡̨̨̡̢̨̡̡̡̧̧̧̛̛̛̛̛̛̛̛̛̛̛͉̪̲̜͓̘͍͚̱͖͔̥̩͎̯̯͔̝͈̰̘̲̻̘͎̗̺̦̜̠͇̲̰̦̠̦̱͇̺͇͎̰͔̖̙͔̗̬̼̩͖̭͍͖̰͙͕̜̹͎̤͚͕͉̫̞̱̞̜̘͇͍̦̭͚̗̞̭̦̹͈̣͉̖̳̭̖̱͔̰̥̲͍̦͎̮̙͚͚͍̠̫͉̦̪̯̫̬͍͙̝͇̰̟͓̙̦̬̰̯̜͙̬̼̰͍̜͇̲̠̺͈͖͍̙̲͙͍̻̻̙͓͔̺͑̓̆̾̉̍̌̇̓̎̈́̉͛̏̓̂̀́́͑̎̈́̽̆̀̈̒̈́̇̌̿̓̒̀̀̈́̄̒͛̎̿̎̽́͐̍̄̅̂̌͑͊͒͒̅͒̄̈́͑͑̀͆̅̑̎͑̀̓͑̀̉͋̉̀̀̾̅̒̈̏̽̀̇̄̐̅͑͆̀̈́̑̒͌̒̈́̈́̀͋̊̓̅͛̀̇̃̈́̀̏̑̉̀̉͐̊́̀̋̌͂̓̈́̈́́̂͂̊̈́̓̔͂̑̃̅̀̒͑̀̓̈́̀͛͗̉͊́́͗̿̔̈́̐̋͐̇͑͂̓̊̽̑͋͛̾̅̅̌̽͒̽̍̎́̔̿̈́́̂͌͌͌̉͗͛̇͗̐͊̀͒̊͒̿̓͋͛̃̈́̍́͗͒̃̑̈̿̐̒̈́̅̽̎̿̅̿̑́̔̂̈́̔̉̈́́́̎̒̐̇̊͑͋̇͒͒̔͛̿͒́͛͘̚͘͘̕͘̚̚̕͘̚͘̚͘̕͘͘̕̚͘̚͘͘͜͜͠͝͝͝͝͝͠͠͝͠͝͠͝͠͝͝͠͝͝͝͝͠ͅͅͅͅͅͅͅƠ̴̧̨̧̨̧̢̨̢̨̡̢̧̢̧̢̢̨̛̛̛̯̞͍̤͙͖̻̯̪̜̬̝̠͈̗͖̥͓͎͉̣͎̞͖̜̼̖̯͓͖̦̳̳͇͓̖̮̱͖̝̜̩̙̰̖̣̜̭̯̹̪̠̲̹̻̹̰̘̼͖̟͍̖̳̤͇̥͚̥̬͙͚̮̦̬̬͚̯̣̭̤͈͖̖̯̮̜̝͚̥̼̳̲̬͖͓͍͈͔̺̗̗̦̲̟̻͖̲̭͙̼̼̰̳̗͇̟͇͕̪̺̮͕͓̹͉̟̝̻̭͉̫̯̼͍̬̦̜̪̮̲̌͆̐̒̿̆̏̂̇͂̀̃̔͛̍̾̂̆̾̀̒͗́̃͆̊̈́̅͂͐̈́͌̋̄̀̔͛̆̄̔͂̀̐̽͌́͆̓̆̓̇͛͐̋͂͐͛̐̑̍͌͐̎͑̆́͐͌̅͌̈̽̎̅͛̆̿̍̌͛̈́̈́̈́̓͂́̇̓̽̓͗̋͋̅̽͆̓̊̿͆̽͐͋̏͒͒̽͆̂͛̇̈́̒͒͑͗̊̋̌̈̊́̾̑͋̆͋̈́̆̎̈́͗͐́́̃̓̅͑̿͑̈́̈́͋͋͑̀͗͊̽̊̉̃̎̈́͂͆͌̀͒̎̉͐̈́͌͐͛̃̑͋̃́̿̂̀̿̋̄̆̊͑͂͆̒̀̂̒̽̔̃̑̌̎̾̐͂̈͗̿̂̓͆́̓̀̍̅̅̑̂̽̔̃̅̈́͂̀̀̑̚͘̕͘͘̚̚͘͘̕͜͜͜͜͜͠͠͠͝͝͝͝͠͠͝͝͝͝͠ͅṊ̷̨̡̨̡̨̨̡̡̢̢̧̨̢̧̨̡̨̡̡̡̨̨̡̢̡̨̨̢̛̛̛̛̫͖̯͕̯̹̤̻͍̤̦̼̞͙̘̤̣̮̟̹̙̱̺͍̹̻͓̯̜̠̻̮̟͉̻̜͓͓̞̪̬͉͙̤̮̞̳̺͔̬̘͍̖͖̫̻̰̟̘͉͍̘̩͈̥͖̜̼͇̙̠̙͈̘͕̦͚̬̝̱̙͙͔͇̞̜̱͈̫͉̭̫͕̺͈̭̞͖̤̫̜̯̠̜͍̟̻̫̪͚̟̣̦͎̬̪͕̻̖͔͔͕͔̮͍͉͍̠͍̱̘̰̹̫̙͇̺̤͙̬̪͎̼̬̭̙͙̭̣̳̼͖̤̭͚̟̻̦̫̤̦̜̹̳̰̺͈̬̝̫̜͔̦̝̲͕̯̙̙̫̜̺͙͖̘̩̤͇̮̭̤̬̱͉̲͙͙̮̬̤̺̟̼̮̣̺͖͔͖͓͍̤̠͈̳̖̹̝̥̲̠̣̻̣̦̠̤͔̭̟͈̱̰͍͓̼͉̗͖͓̟̥̝͓̟͚̖̰̖̼̪͚͔͙̯̟̔̔͋̓̌̌͐͑͑̊̈́̇͌̾͆̇̐̐͒̑̂̂̈́̍͂̑̇̊̍́̀͌͛̌͌̂̓̓̓͊̿͌̐̑̂͛̈́̄̉͌̍͆̆̈́͑̎͊̋̅͋̃̊̍̽̒̆̊̒́͌̃̿͊̔́̈̊̓̄̉̎͊̓̈́̊̓̑̎͋̋̔̄̒͛̿̈̀̔̈́̓̎̿͋̐̀̑̊͊̅͆͂͊͛͊̅͐̔͑͊̓̑̔̈̊͋̈̎̓̌͂̽͊̎̏̉̓͛̓̅̒̔̀̑̓̋́̃̋̂̾̅̊͛̈͊̈́́͌̆̈́͑́̽̈́͐͛͆̿̒̆̓͒͋͐̒̔̂́́̍̓͐̀͑̔͒͆̔̇́͂͐̇̓͆̈̉̽̈̒̓̍͒͘̕̚̕̚̕͘͘̚͘̚͘͜͜͜͜͝͠͝͝͠͠͝͠͝͝͠͝͝͠͠͝͝͝ͅͅͅͅͅĘ̵̧̢̡̢̧̡̢̢̨̢̡̧̨̧̢̨̡̢̨̨̡̢̧̡̡̡̛̛̛̛̛̛̖̭͈̣̰͉͖͕̞̯̲͍̰̗̪̫̻͎̝͖͙͎̭̺̦̤͓͉̹͉̥̠̤̺̼̫͔̳̝͍̟̥̖̲̫̝̤̖̻͙̺̮̯̤̥̟̲̺͖̝̩̝̞̗͇̪̣̳͕͉̻̰̮̩͔̩̗͎͈̬͖̳̟̻̬͔̝̗̲͎̝͖̫͎̺͈͈͕̼̤͓̲̤͉̻̹̲̝̥̻̘̭̯̼̘͍͙̲͎̰̲̗͔̬̘̬̻͚̞̠͕̭̭̪̖̫̫̞̖̳̰̯̟͚̹̩̮̼̬̮̘͇̼̘̖̟̖̲͎̦̞̱͔̪̯̙͖̱͇̣̠̖͖̹̗̫̲̩̟̥̰͕̺͇͕̩̪̮̜̫͕̻̳̰̺͈̣͍̤̺̫̻͉̫͈̝̠̦̟͍̗͊̓̅͌͗̊̽̓̍̑̈̐́̇͌̍̎͋͐̄̈́͌̋͗̀͒̀͒̊͑͐́̎́̂̇̄̃͋̀̇̒̄̉̑͂̍͋̈́̇̿̀̎̉̀̓̍̎̌̏͐̑͛̓̍̏̌͗̔̆͋̃̆̋́̽̓̂̓̑̃͗͗̂̌̒̏͆͌̈́̍̑̌̇̈͌́͂͆̔̐͐͊̾̌̓̽̐̒̎́̑̃̉̑͆̈́̓̓͌̎̋̊̿͗̽̌͌͊̉̓͐́̀̽̓̈́̏̋̌̿̽̋̏͛̚͘͘̚͘͘̚͘̕̚͘͜͜͠͠͝͝͠͠͝͠͝͝͠͠͝ͅͅͅͅS̴̨̢̢̨̡̨̧̡̢̡̨̧̢̡̧̡̢̛̜̗̠̗͖̘̩̰̱̲̳̱̪͓͔̣̟̘̳̪̙̫̮̻̰̫͇͕̯͙̖̬͇̬̗̟̥̥͔̯̟̻͙͔̮͖̗͔̜̙͕̟̞̳͈̩͎̭͕͖̤̹͈͍̠̦̲̺͚̤͈͖̥͈̱̜̩̞̝̤̙̳̞̩̫̮̳̩̜̪̙͚͉̬̱͖̠̘̲̝̼̤͚͚͚̳̪̺̥̱͉͉͙̖̜̝̭̗̠̗̲͈̜̭̫̗̥̦̳͇̪̥̜͙̝̞̗͚͇̻̝͉͂͛͆͐̈͐͂̉̿͆̀̐͊̊̓̄̎̉͛̀̑̃̀̋̿̌̍̈̈́͋̂̈̓͐̈́̃͒̐̈́̑̀̆̓͑̐̏͐́͑̈́̀͐̄̔̐͑̈́͋̚̚̚͘͘͜͜͜͜͝͝͝͠͠ͅͅ");
	   spookyList.add("see you in the skeleton war");
	   
	   
   }
   public ArrayList<String> getResponseList() 
   {
	   return responseList;
   }
   public String processText(String userText )
   { String output = "";
   if (!validityChecker(userText))
   {
	   output += "you are mean and this is null";
   }
   else
   {
   
	   if (contentChecker(content)) {
		  output += ("You said the special words.\n");
	  }
	   String WhatTheChatBotSays = responseList.get((int)Math.random()*responseList.size());
	    output = ( "You said: \" " + userText + "\"" + "Chatbot says: \"" + WhatTheChatBotSays + "\"\n");
   }
	 
	   return output;
   }
   public boolean validityChecker(String text)
   {
	   boolean isValid = false;
	   
	   if (text!= null && text.length() > 3)
	   {
		   isValid = true;
	   }
	   return isValid;
   }
public boolean spookyChecker(String phrase)
{
	Boolean ifSpooky = false;
	if (phrase.equals("Halloween"))
		{ ifSpooky = true;
		}
	else if(phrase.equals("spooky")){
		
	}
	else if (phrase.equals("Easter"))
	{
		ifSpooky = false;
	}
	else 
	{
		for (int  lop = spookyList.size() - 1; lop > -1 ; lop -= 1) {
			if (phrase.equals(spookyList.get(lop)))  
			{
			ifSpooky = true;
			}
			
			
		}
	}
	return ifSpooky;
}
public boolean legitimacyChecker(String input)
{
	Boolean isValid = false;
	if (input == null)
	{
		isValid = false;
	}
	else if (input.equals(""))
	{
		isValid = false;
	}
	else if (input.equals("asdfghjkl"))
	{
		isValid = false;
	}
	else if (input.length() > 1) 
	{
		isValid = true;
	}
	
	
	return isValid;
}
public boolean contentChecker(String userinput)
{   
    Boolean fug = false;
    if (userinput.contains(content))
    {
    	
    	if (userinput.length() == content.length()) {
    		fug = true;
    	}
    	 
//    }
//    else if (userinput.equals("text" + content ))
//    {
//    	fug = false;
//    }
//    else if (userinput.equals( content + "text"))
//    {
//    	fug = false;
//    }
    }
    
   
	return fug ;
}

}

   
