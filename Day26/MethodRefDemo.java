package Day26;

interface StringFunc{
  String func(String n);
}

class MyStringOp{
  static String strReverse(String str){
    String result = " ";
    int i;;
    for( i=str.length()-1;i>=0;i--){
      result += str.charAt(i);
    }
    return result;
  }
}
public class MethodRefDemo {

  static String stringOp(StringFunc sf,String s){
    return sf.func(s);
  }
  public static void main(String[] args) {
    
    String inStr = "Lambdas add power to Java";
    String outStr;

    //Here, a method referance to strReverse is passed to stringOp().
    outStr = stringOp(MyStringOp::strReverse, inStr);

    System.out.println("Original String:"+inStr);
    System.out.println("String Reversed: "+outStr);
  }
}
