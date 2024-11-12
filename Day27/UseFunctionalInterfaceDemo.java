package Day27;
//Built in functional interface.....
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UseFunctionalInterfaceDemo 
{
 public static void main(String[] args) 
 {
  Function<Integer , Integer>factorial = (n) ->{
    int result = 1;
    for(int i=1;i<=n;i++){
      result = i*result;
    }
    return result;
  };

  UnaryOperator<Integer> square = (n) ->{

     if(n == 0)
       return 0;

     int result = n*n;
     return result;
  };
   //Functional Built In 

  System.out.println("The factorial of 3 is:"+factorial.apply(3));
  System.out.println("The factorial of 5 is:"+factorial.apply(5));

  //UnaryOperator Built In
  System.out.println("The Square of 124 is:"+square.apply(124));
  System.out.println("The Square of 34 is:"+square.apply(34));
 } 
}
