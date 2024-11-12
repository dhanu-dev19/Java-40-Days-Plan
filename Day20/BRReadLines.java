package Day20;

import java.io.*;
public class BRReadLines {
  public static void main(String[] args) throws IOException
  {
    
    //create a BufferedReader using System.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in,System.console().charset()));
    String str;
    System.out.println("Enter lines to text.");
    System.out.println("Enter 'stop' to quit.");

    do{
      str = br.readLine();
      System.out.println(str);
    } while(!str.equals("stop"));
  }
}
