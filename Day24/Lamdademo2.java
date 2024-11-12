package Day24;


//Functional Interface
interface NumericTest
{
  boolean test(int n);
}
public class Lamdademo2 
{
  public static void main(String[] args) 
  {
    NumericTest isEven = (n) ->(n % 2) == 0;

    if(isEven.test(2))
      System.out.println("Yes!!,It is Even.");
    if(isEven.test(9))
      System.out.println("Yes!!,It is Even.");
      
      //is non-negative
      NumericTest isNonNeg = (n) -> n>=0;

      if(isNonNeg.test(2))
         System.out.println("Yes!!,It is Positive Number.");
      if(isNonNeg.test(-1))
         System.out.println("Yes!!,It is Positive Number.");   
  }
}
