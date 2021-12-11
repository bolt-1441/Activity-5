import java.io.*;
import java.util.*;

public class FactsRun
{
   public static void main(String[] args)throws FileNotFoundException//amin run methoed was writen by teddy clark
   {
      Scanner userIn = new Scanner(System.in);
      System.out.println("Wlecome to the randome facts genaratore!");
      System.out.println("we have facts about: \nanimals\nhistory\ntravel\nmusic\nsports\nhuman\nfunny\nmiscellaneous");
      Facts arrays = new Facts();
      String[] animal = arrays.getAnimal();//pulling the arrays from the facts file and putting them in to arrays for the run methoud to use
      String[] history = arrays.getHistory();
      String[] travel = arrays.getTravel();
      String[] music = arrays.getMusic();
      String[] sports = arrays.getSport();
      String[] human = arrays.getHuman();
      String[] funny = arrays.getFunny();
      String[] misc = arrays.getMisc();
      boolean STOP = true;//used to tell the program to stop
      while(STOP)
      {
         System.out.println("what facts would you like to learn about?");
         String factCat = userIn.nextLine();//gets the user input on what catagory that they want to learn about

         if(factCat.equals("animal facts")){//each if/else if is used for each catagory of facts 
            System.out.println("We have " + animal.length + " facts about animals.  \nPick a number from 1-" + animal.length);//user pickes what fact to look at
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(animal[index]);//pulls fact from array of the catagory and prints to the screen from user input
            
               
         }else if(factCat.equals("history facts")){
            System.out.println("We have " + history.length + " facts about history.  \nPick a number from 1-" + history.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(history[index]);
            
         }else if(factCat.equals("travel facts")){
            System.out.println("We have " + travel.length + " facts about traveling.  \nPick a number from 1-" + travel.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(travel[index]);
            
         }else if(factCat.equals("music facts")){
            System.out.println("We have " + music.length + " facts about music.  \nPick a number from 1-" + music.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(music[index]);
            
         }else if(factCat.equals("sports facts")){
            System.out.println("We have " + sports.length + " facts about sports.  \nPick a number from 1-" + sports.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(sports[index]);
            
         }else if(factCat.equals("human facts")){
            System.out.println("We have " + human.length + " facts about humans.  \nPick a number from 1-" + human.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(human[index]);
            
         }else if(factCat.equals("funny facts")){
            System.out.println("We have " + funny.length + " funny facts.  \nPick a number from 1-" + funny.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(funny[index]);
            
         }else if(factCat.equals("miscellaneous facts")){
            System.out.println("We have " + misc.length + " miscellaneous facts.  \nPick a number from 1-" + misc.length);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(misc[index]);
            
         }else if(factCat.equals("stop")){//will end the program if users inputs stop, then prints our names
            System.out.println("thank you for using the Fact Genorator/nCreated by: Aaron donetaly and Teddy Clark");
            STOP = false;
         }else{
            System.out.println("that is not a corect catgory");//fail safe for wrong user input, just loops the program so that the user can re-try to input a corect catagory
         }
      }
   }
}
