package Day1;
public class JumpStatements {
  public static void main(String[] args) {
    
    //Continue statemnts with label  to describing  enclosed loop
  outer: for (int firstIndex = 0; firstIndex < 10; firstIndex++) 
  {
            for (int secondIndex = 0; secondIndex < 10; secondIndex++) 
            {
               if(secondIndex > firstIndex)
               {
                System.out.println();
                continue outer;
               }
               System.out.print(" " + (firstIndex * secondIndex));
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
  

