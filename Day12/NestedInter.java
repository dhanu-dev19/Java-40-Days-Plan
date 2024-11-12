package Day12;
class A {

  public interface NestedIf {
    boolean isNotNegative(int x);
  }
}
class B implements A.NestedIf{ //This Name Fully Qualified From Nested interface

  public boolean isNotNegative(int x){ //Method Must be Public for visibility of code
    return x < 0? false:true;
  }
}
public class NestedInter {
  public static void main(String[] args) {
    A.NestedIf c = new B();
    if(c.isNotNegative(10)){
      System.out.println("Value Greater than Zero.");
    }
    if (c.isNotNegative(-1)) {
      System.out.println("value Greater than Zero.");
    }
    else{
      System.out.println("value is Negative or Zero");
    }
  }
}
