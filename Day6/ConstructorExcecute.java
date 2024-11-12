package Day6;
class A4{
  A4()
  {
    System.out.println("Inside A Constructor");
  }
  
}
class B2 extends A4{
  B2(){
    System.out.println("Inside B Constructor");
  }
}
class C2 extends B2{
  C2(){
    System.out.println("Inside C Constructor");
  }
}
public class ConstructorExcecute {
  public static void main(String[] args) {
    C2 obj = new C2();
    
  }
}
