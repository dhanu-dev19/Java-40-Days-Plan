package Algo365;
import java.util.Scanner;
public class UpperTitle{

  public static String capitalize(String s) {
    // Write code here
    StringBuilder title = new StringBuilder();
    boolean CapitalizeNext = true;
    for(int i=0;i<s.length();i++){

      char c = s.charAt(i);
      if(c==' '){
        CapitalizeNext = true;
        title.append(c);
      }
      else if(CapitalizeNext){
        title.append(Character.toUpperCase(c));
        CapitalizeNext = false;
      }
      else{
        title.append(Character.toLowerCase(c));
      }
    }

    return title.toString();
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String text = "i am dhanush";
    String Result = capitalize(text);
    System.out.println(Result);
  }

}