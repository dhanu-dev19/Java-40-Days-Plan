package Day5;
class A{
  int i,j;
  void PrintNum(){
    System.out.println("Value of i and j is:"+i+" "+j);
  }
}
class B extends A{
  int k;
  void PrintK(){
    System.out.println("Value of k is:"+k);
  }

  void AddNum(){
    System.out.println("Sum:"+(i+j));
  }
}
public class Inheritance1 {
  public static void main(String[] args) {
    B ob = new B();
   ob.i = 10;
   ob.j = 20;
   ob.k = 30;
   ob.PrintK();
   ob.PrintNum();
   ob.AddNum();
  }
  
}
