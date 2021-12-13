import java.util.*;
import java.io.*;

public class Facts 
{
        String[] animal = new String[28]; //the arrays of each fact
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
         for(int i = 0; i < 28;i++)//this loop reads file and the 1st array 
         {
             String factcs = myReader.nextLine();
             animal[i] = factcs;
             //System.out.println(factcs);
         }      
         for(int i = 0; i < 16;i++)//this loop reads file and the 2nd array 
         {
             String factcs = myReader.nextLine();
             history[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 17;i++)//this loop reads file and the 3rd array 
         {
             String factcs = myReader.nextLine();
             travel[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 18;i++)//this loop reads file and the 4th array 
         {
             String factcs = myReader.nextLine();
             music[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 16;i++)//this loop reads file and the 5th array 
         {
             String factcs = myReader.nextLine();
             sport[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 24;i++)//this loop reads file and the 6th array 
         {
             String factcs = myReader.nextLine();
             human[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 65;i++)//this loop reads file and the 7th array 
         {
             String factcs = myReader.nextLine();
             funny[i] = factcs;
             //System.out.println(factcs);
         }
         for(int i = 0; i < 13;i++)//this loop reads file and the 8th array 
         {
             String factcs = myReader.nextLine();
             misc[i] = factcs;
             //System.out.println(factcs);
         }
         }
    catch (FileNotFoundException ex)  //makes sure the file can be found
    {
        System.out.println("Error finding facts.txt");

    } 
   }
   public String[] getAnimal() //makes the arrays readable to people out of the class
   {
      return animal;
   }
   public String[] getHistory()
   {
      return history;
   }
    public String[] getTravel()
   {
      return travel;
   }
    public String[] getMusic()
   {
      return music;
   }
    public String[] getSport()
   {
      return sport;
   }
    public String[] getHuman()
   {
      return human;
   }
    public String[] getFunny()
   {
      return funny;
   }
    public String[] getMisc()
   {
      return misc;
   }
      
   
}
