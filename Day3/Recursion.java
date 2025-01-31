package Day3;

class FactorialDemo
{

  int factorialNum(int number)
  { int result = 0; 

    if(number == 1)//Termination Condtion used to stop the program OtherWise it leads to infinite loop.
       return 1;

    else
       result=factorialNum(number - 1) * number;//Method calling or invoking itself called recusrsion.
       return result;   

  }

}
public class Recursion {
  public static void main(String[] args) {
    
    FactorialDemo object = new FactorialDemo();
    int result = 0;

     result = object.factorialNum(5);
     System.out.println("Factorial of Number:"+ result);
  }
}
