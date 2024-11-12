package Day14;

public class SuperSubcatch {
  public static void main(String[] args) {
    try{
      int a = 0;
      int b = 42/a;
    }
    catch(Exception e){
      System.out.println("Generic Exception Catch.");
    }
    /* Error:Unreachable catch block for ArithmeticException. It is already handled 
     by the catch block for ExceptionJava(553648315)
    catch(ArithmeticException e){
      System.out.println("Arithematic class never reached");
    }*/
  }
}
