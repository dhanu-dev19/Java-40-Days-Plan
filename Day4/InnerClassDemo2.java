package Day4;
class Outer1
{
  int outer_x = 100;
  
  void test()
  {
    for(int index = 0; index < 10; index++)
    {
      class Inner1
      {
        void display(){
          System.out.println("Display:"+ outer_x);
        }
        
      }
      Inner1 inner = new Inner1();
      inner.display(); //Invoking through for loop every time 
    }
     
  }
  
}


public class InnerClassDemo2 {
  public static void main(String[] args) {
    Outer1 outer = new Outer1();
    outer.test();
  }
}
