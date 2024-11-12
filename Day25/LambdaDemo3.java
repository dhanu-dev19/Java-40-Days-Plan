package Day25;

//Two paarameter functional interface and implementation
interface NumericTest2
{
    boolean test(int n,int d);
}
public class LambdaDemo3 {
  public static void main(String[] args) {
    NumericTest2 isFactor = (n, d) ->(n % d) == 0;
    if(isFactor.test(8, 2))
    {
      System.out.println("2 is a factor of 8");
    }
    if(isFactor.test(10, 3))
    {
       System.out.println("3 is factor of 10");
    }
  }
}
