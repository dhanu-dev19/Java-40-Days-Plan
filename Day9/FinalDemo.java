package Day9;
class A8{
final void math(){
  System.out.println("This is final method");
}
}
class B6 extends A8{
 /*  void math(){
    //Can't over ride this method
  }*/
}
public class FinalDemo {
  public static void main(String[] args) {
    A8 a = new A8();
    a.math();
  }
  
}
