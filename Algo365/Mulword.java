package Algo365;

public class Mulword {

  public static String mulWord(String s, int n) {
    // Write code here
    String text=" "; 
    for(int i = 1;i<=n;i++){
        text += s+" "; 
    }
   return text;
}
  
  public static void main(String[] args) {
    String result =mulWord("Example", 2);
    System.out.println(result);
  }
}
