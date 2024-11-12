package Day1;
import java.util.*;
public class JumpStatements {
  public static void main(String[] args) {
    
    //Continue statemnts with label  to describing  enclosed loop
  outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if(j > i){
                System.out.println();
                continue outer;
               }
               System.out.print(" " + (i*j));
            }
      System.out.println();
    }
  
    
  //Break Statements.
  boolean t = true;
  first: {
    second: {
      third: {
        System.out.println("Before Break:");
        if(t)  break second;
        System.out.println("This won't execute");
      }
      System.out.println("This won't execute");
    }
    System.out.println("This is after second block");
  }
}
}
  

