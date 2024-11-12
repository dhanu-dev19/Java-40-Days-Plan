package Day24;

interface StringFunc
{
     String func(String n);
}
public class LambdaAsArgumentDemo {
  //pass the argument as lambda
  static String StringOp(StringFunc sf,String s){
    return sf.func(s);
  }
  public static void main(String[] args) {
    String inStr = "Lamda add power to Java";
    String outStr;

    System.out.println("here the input string: "+inStr);

    outStr = StringOp( (str)->str.toUpperCase(), inStr);

    System.out.println("The string in uppercase: "+outStr);

    //remove white space

    outStr = StringOp((str) ->{
      String result = " ";
      int i;
      for(i=str.length()-1;i>=0;i--){
        if(str.charAt(i) != ' ')
        result+=str.charAt(i);
      }
      return result;
    } , outStr);

    System.out.println("The String with spaces removed:"+outStr);

    
  }
}
