package Day9;

final class A9{
  int a = 10;
}
/*class B3 extends A9{  // Inheritance not possible
  void print(){
    System.out.println("Value will be:"+a);
  }*/
public class FinalInherit {
  public static void main(String[] args) {
    A9 ok = new A9();
    System.out.println(ok.a);
  }
}
