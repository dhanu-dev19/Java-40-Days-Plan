package Day4;
class Outer
{

int Outer_x = 10;
private int number = 50;//It can access private method
 void test(){
  Inner inner = new Inner();
  inner.Sum();
 }

class Inner
{
  void Sum(){
    System.out.println("Sum of two numbers:"+(Outer_x+number));
  }
}


}

public class InnerClassDemo {
  public static void main(String[] args) {
    Outer outer1  = new Outer();
    outer1.test();
  }
  
}
