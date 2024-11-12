package Day13;

import java.util.Random;

public class HandleError {
  public static void main(String[] args) {
    int a = 0,b = 0,c = 0;
    Random r = new Random();
    for(int i=0;i<32;i++){
      try{
          b = r.nextInt();
          c = r.nextInt();
          a = 1243/(b/c);
      }
      catch(ArithmeticException e){
        System.out.println("Divison by Zero");
        a = 0;
      }
      System.out.println("Result: "+a);
    }
  }
}
