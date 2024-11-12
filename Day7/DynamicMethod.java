package Day7;
class A5{

  void callme(){
    System.out.println("Inside A callme method");
  }
}
class B3 extends A5{

  void callme(){
    System.out.println("Inside B callme method");
  }
}

class C3 extends B3{
  void callme(){
    System.out.println("Inside C callme method");
  }
}
public class DynamicMethod {
  public static void main(String[] args) {
    A5 a = new A5();
    B3 b = new B3();
    C3 c = new C3();

    A5 r ;        //Note: I will notice that the B3 is not refer to A5 we have to create with super 
    r = a;      
    r.callme();

    r = b;
    r.callme();

    r = c;
    r.callme();
  }
}
