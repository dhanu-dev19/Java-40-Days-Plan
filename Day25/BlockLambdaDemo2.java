package Day25;

interface StringFunc
{
  String func(String n);
}

public class BlockLambdaDemo2 {
  
  public static void main(String[] args) {
    StringFunc reverse = (str) ->{
      String result = " ";

      for(int i=str.length()-1;i>=0;i--){
        result+=str.charAt(i);
      }
      return result;
    };

    System.out.println("Lambda Reversed is:"+reverse.func("Lambda"));
    System.out.println("Expression reversed:"+reverse.func("Expression"));
  }
}
