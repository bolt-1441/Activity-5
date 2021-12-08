import java.util.*;
import java.io.*;

public class Facts 
{
   public static void main(String[] args)
   {
      
      
      boolean STOP = true;
      Scanner userIn = new Scanner(System.in);
      System.out.println("Wlecome to the randome facts genaratore!");
      System.out.println("what facts would you like to learn about? /nCatgorys are:/nAnimal facts/nHistory facts/nTravel facts/nMusic facts/nSports facts/nHuman facts/nfunny facts/nMiscellaneous facts/nTo stop enter stop");
      String factCat = userIn.nextLine().toLowerCase();
      //need to orginise in to whitch cat they whant 
      //and only alow the randome to pull form those
      while(STOP)
      {
         if(factCat.equals("animal facts")){
            
         }else if(factCat.equals("history facts")){
            
            
         }else if(factCat.equals("travle facts")){
            
            
         }else if(factCat.equals("music facts")){
            
            
         }else if(factCat.equals("sports facts")){
            
            
         }else if(factCat.equals("human facts")){
            
            
         }else if(factCat.equals("funny facts")){
            
            
         }else if(factCat.equals("miscellaneous facts")){
            
            
         }else if(factCat.equals("stop"){
            STOP = false;
         }else{
            System.out.println("that is not a corect caatgory");
         }
      }
      
      
      
      
      
      
   }
    
   
   
   
   
   
   
   
   
}
