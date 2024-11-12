package Day30;

import java.io.*;  //Using trim() to process commands..

public class UseTrim 
{
  public static void main(String[] args) throws IOException
  {
    //Create a BufferedReader
    BufferedReader br = new BufferedReader(new
    InputStreamReader(System.in, System.console().charset()));
    String str;

    System.out.println("Enter 'stop' to quit.");
    System.out.println("Enter state: ");
    do{
      str = br.readLine();
      str = str.trim(); //remove whitespace

      if(str.equals("Illinois"))
         System.out.println("Captial is Springfield");
      else if(str.equals("Missouri"))
         System.out.println("Capital is Jefferson City.");
      else if(str.equals("California"))
         System.out.println("Captial is Sacramento.");
      else if(str.equals("Washington"))
         System.out.println("Captial is Olympia.");   

    }while(!str.equals("stop"));
  }
}
