package Day26;

interface StringFunc1{
  String func(String n);
}

class MyStringOp1{
   String strReverse(String str){
    String result = " ";
    int i;;
    for( i=str.length()-1;i>=0;i--){
      result += str.charAt(i);
    }
    return result;
  }
}
public class MethodRefDemo2 {

  static String stringOp(StringFunc1 sf,String s){
    return sf.func(s);
  }
  public static void main(String[] args) {
    
    String inStr = "Lambdas add power to Java";
    String outStr;

    MyStringOp1 strOps = new MyStringOp1();
    //Here, a method referance to instance method strReverse.
    outStr = stringOp(strOps::strReverse, inStr);

    System.out.println("Original String:"+inStr);
    System.out.println("String Reversed: "+outStr);
  }
}
