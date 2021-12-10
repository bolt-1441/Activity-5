import java.util.*;
import java.io.*;

public class Facts 
{
  public static void file() throws FileNotFoundException 
  {
    File file = new File ("facts.txt");
    try
    {
        Scanner myReader = new Scanner(file);
        String[] animalFacts = new String[55];
         for(int i = 0; i < 55;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             System.out.println(factcs);
         }      
    }
    catch (FileNotFoundException ex)  
    {
        System.out.println("Error finding facts.txt");

    } 
   }
     public static void main(String[] args)throws FileNotFoundException//amin run methoed was writen by teddy clark
   {
      file();//calls static "file()" to create arrays and read file
      Scanner userIn = new Scanner(System.in);
      System.out.println("Wlecome to the randome facts genaratore!");
      boolean STOP = true;//used to tell the program to stop
      while(STOP)
      {
         System.out.println("what facts would you like to learn about?");
         String factCat = userIn.nextLine();//gets the user input on what catagory that they want to learn about

         if(factCat.equals("animal facts")){//each if/else if is used for each catagory of facts 
            System.out.println("We have " + animal.length() + " facts about animals.  /nPick a number from 1-" + animal.length());//user pickes what fact to look at
            int fact = userIn.nextLine();
            System.out.println(animal[fact]);//pulls fact from array of the catagory and prints to the screen from user input
            
               
         }else if(factCat.equals("history facts")){
            System.out.println("We have " + history.length() + " facts about history.  /nPick a number from 1-" + history.length());
            int fact = userIn.nextLine();
            System.out.println(history[fact]);
            
         }else if(factCat.equals("travel facts")){
            System.out.println("We have " + travel.length() + " facts about traveling.  /nPick a number from 1-" + travel.length());
            int fact = userIn.nextLine();
            System.out.println(travel[fact]);
            
         }else if(factCat.equals("music facts")){
            System.out.println("We have " + music.length() + " facts about music.  /nPick a number from 1-" + music.length());
            int fact = userIn.nextLine();
            System.out.println(music[fact]);
            
         }else if(factCat.equals("sports facts")){
            System.out.println("We have " + sports.length() + " facts about sports.  /nPick a number from 1-" + sports.length());
            int fact = userIn.nextLine();
            System.out.println(sports[fact]);
            
         }else if(factCat.equals("human facts")){
            System.out.println("We have " + human.length() + " facts about humans.  /nPick a number from 1-" + human.length());
            int fact = userIn.nextLine();
            System.out.println(human[fact]);
            
         }else if(factCat.equals("funny facts")){
            System.out.println("We have " + funny.length() + " funny facts.  /nPick a number from 1-" + funny.length());
            int fact = userIn.nextLine();
            System.out.println(funny[fact]);
            
         }else if(factCat.equals("miscellaneous facts")){
            System.out.println("We have " + misc.length() + " miscellaneous facts.  /nPick a number from 1-" + misc.length());
            int fact = userIn.nextLine();
            System.out.println(misc[fact]);
            
         }else if(factCat.equals("stop")){//will end the program if users inputs stop, then prints our names
            System.out.println("thank you for using the Fact Genorator/nCreated by: Aaron donetaly and Teddy Clark");
            STOP = false;
         }else{
            System.out.println("that is not a corect catgory");//fail safe for wrong user input, just loops the program so that the user can re-try to input a corect catagory
         }
      }
   }
}
