package Day13;

public class Exc2 {
  public static void main(String[] args) {
    int divisor, result;
    try{
      divisor = 0;
      result = 42/ divisor;
      System.out.println("This is not be printed.");
    }
    catch(ArithmeticException e)
    {
       System.out.println("Division by Zero.");  
    }
    System.out.println("After catch statement.");
  }
}
