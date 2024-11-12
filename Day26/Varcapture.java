package Day26;

@FunctionalInterface
interface MyFunc
{
   int func(int n);
}
public class Varcapture
{
 public static void main(String[] args) {
  
  //A local variable that can be captured.
  int num = 10;

  MyFunc myLambda = (n) ->
  {
    //This is use of num is Ok.It does not modify num.
    int v = num + n;

   // num++;
    return v;
  };

 // num = 9;
 System.out.println("Value of num :"+ num);//The value must be 10
 //Note: it can't be modified inside or outside the of the scope.....
   System.out.println(myLambda.func(10));
 }
}

