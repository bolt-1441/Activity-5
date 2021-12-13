import java.io.*;
import java.util.*;

public class FactsRun
{
   public static void main(String[] args)throws FileNotFoundException//main run methoed was writen by teddy clark
   {
      Scanner userIn = new Scanner(System.in);
      System.out.println("Welcome to the random facts generator!");
      System.out.println("we have facts about: \nanimals\nhistory\ntravel\nmusic\nsports\nhuman\nfunny\nmiscellaneous");
      Facts arrays = new Facts();
      arrays.file();
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
            int len = animal.length;
            len--;len--;//used to match up the number tied to the String stored in the array and the number inputed by the user
            System.out.println("We have " + len + " facts about animals.  \nPick a number from 1-" + len);//user pickes what fact to look at/shows num of facts and what topic
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(animal[index+1]);//pulls fact from array of the catagory and prints to the screen from user input
            //+1 is so that the index entered by the user matches with index of arrays
            
               
         }else if(factCat.equals("history facts")){
            int len = history.length;
            len--;len--;
            System.out.println("We have " + len + " facts about history.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(history[index+1]);
            
         }else if(factCat.equals("travel facts")){
            int len = travel.length;
            len--;len--;
            System.out.println("We have " + len + " facts about traveling.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(travel[index+1]);
            
         }else if(factCat.equals("music facts")){
            int len = music.length;
            len--;len--;
            System.out.println("We have " + len + " facts about music.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(music[index+1]);
            
         }else if(factCat.equals("sports facts")){
            int len = sports.length;
            len--;len--;
            System.out.println("We have " + len + " facts about sports.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(sports[index+1]);
            
         }else if(factCat.equals("human facts")){
            int len = human.length;
            len--;len--;
            System.out.println("We have " + len + " facts about humans.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(human[index+1]);
            
         }else if(factCat.equals("funny facts")){
            int len = funny.length;
            len--;len--;
            System.out.println("We have " + len + " funny facts.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(funny[index+1]);
            
         }else if(factCat.equals("miscellaneous facts")){
            int len = misc.length;
            len--;len--;
            System.out.println("We have " + len + " miscellaneous facts.  \nPick a number from 1-" + len);
            String fact = userIn.nextLine();
            int index = Integer.parseInt(fact);
            System.out.println(misc[index+1]);
            
         }else if(factCat.equals("stop")){//will end the program if users inputs stop, then prints our names
            System.out.println("thank you for using the Fact Generator\nCreated by: Aaron donetaly and Teddy Clark");
            STOP = false;
         }else{
            System.out.println("that is not a corect catgory");//fail safe for wrong user input, just loops the program so that the user can re-try to input a corect catagory
         }
      }
   }
}
