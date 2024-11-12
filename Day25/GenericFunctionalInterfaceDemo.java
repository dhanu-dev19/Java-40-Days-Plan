package Day25;

//A generic functional interface...

interface SomeFunc<T>
{
  T func(T t);
}
public class GenericFunctionalInterfaceDemo 
{
  public static void main(String[] args) 
  {
    SomeFunc<String> reverse = (str) ->{
      String result = " ";

      for(int i=str.length()-1;i>=0;i--){
        result+=str.charAt(i);
      }
      return result;
    };

    SomeFunc<Integer> factorial = (n)->{ //This is called lambda body or block
      
      int result = 1;

      for(int i=1;i<=n;i++)
      {
        result = i * result;
      }
      return result;
    };

    System.out.println("Lambda Reversed is:"+reverse.func("Lambda"));
    System.out.println("Expression reversed:"+reverse.func("Expression"));

    System.out.println("The factorial of 5:"+factorial.func(5));
    System.out.println("The factorial of 3:"+factorial.func(3));
  }
}
