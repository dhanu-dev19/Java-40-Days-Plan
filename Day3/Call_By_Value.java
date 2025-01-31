package Day3;

class Test {

  //Note:We cannot use return value because we have to check the variables i and j will change or
  //effect on original value when i am calling methods.
  void meth(int i,int j)
  {
    i *= 2;
    j /= 2;
  }
} 

public class Call_By_Value {
  
  public static void main(String[] args) {
    Test obj = new Test();
    int a = 10;
    int b = 20;
    System.out.println("Before Calling a and b:"+a+" "+b);

    //Function Invocation
    obj.meth(a, b);

    System.out.println("After Calling a and b:"+a+" "+b);
  }
}
