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
     public static void main(String[] args)throws FileNotFoundException
   {
      file();
      Scanner userIn = new Scanner(System.in);
      System.out.println("Wlecome to the randome facts genaratore!");
      System.out.println("what facts would you like to learn about?");
      String factCat = userIn.nextLine();
      //need to orginise in to whitch cat they whant 
      //and only alow the randome to pull form those
       boolean STOP = true;
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
   
   
   
   
   
   
   
}
