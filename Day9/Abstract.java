package Day9;

abstract class Main2{

  abstract void callme();

  void callmetoo(){  //Concrete method.
    System.out.println("This is a concrete method");
  }
}
class Main3 extends Main2{

  void callme(){
    System.out.println("Main3 implementation of call me");
  }
}
class Main4 extends Main3{
 
  void callme(){
    System.out.println("Main4 implemented of call me");
    Main3 ob = new Main3();
    ob.callme();
   }
} 

public class Abstract {
  public static void main(String[] args) {
    //Note we can create constructor for abstract class and also objects.
  Main3 b = new Main3();
  Main4 c = new Main4();
  b.callme();
  b.callmetoo();
  c.callme();
  }
}
