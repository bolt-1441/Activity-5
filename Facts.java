import java.util.*;
import java.io.*;

public class Facts 
{
        String[] animal = new String[28];
        String[] history = new String[16];
        String[] travel = new String[17];
        String[] music = new String[18];
        String[] sport = new String[16];
        String[] human = new String[24];
        String[] funny = new String[65];
        String[] misc = new String[13];
  public void file() throws FileNotFoundException 
  {
    File file = new File ("facts.txt");
    try
    {
        Scanner myReader = new Scanner(file);
         for(int i = 0; i < 28;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             animal[i] = factcs;
             System.out.println(factcs);
         }      
         for(int i = 0; i < 16;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             history[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 17;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             travel[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 18;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             music[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 16;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             sport[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 24;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             human[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 65;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             funny[i] = factcs;
             System.out.println(factcs);
         }
         for(int i = 0; i < 13;i++)//this loop reads file and the array 
         {
             String factcs = myReader.nextLine();
             misc[i] = factcs;
             System.out.println(factcs);
         }
         }
    catch (FileNotFoundException ex)  
    {
        System.out.println("Error finding facts.txt");

    } 
   }
   public String[] getAnimal()
   {
      return animal;
   }
   public String[] history()
   {
      return history;
   }
    public String[] travel()
   {
      return travel;
   }
    public String[] music()
   {
      return music;
   }
    public String[] sport()
   {
      return sport;
   }
    public String[] human()
   {
      return human;
   }
    public String[] funny()
   {
      return funny;
   }
    public String[] misc()
   {
      return misc;
   }
      
   
}
