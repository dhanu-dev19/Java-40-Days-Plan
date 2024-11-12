package Day5;
class MyClass{
  private int i;
  MyClass(int k){
    i = k;
  }
  int geti(){
    return i;
  }
  void seti(int k){
     if(k>=0){
      i = k;
     }
  }
}
public class LocalInfer {
  public static void main(String[] args) {
    var mc = new MyClass(10);//Notice use of var
   
    System.out.println("Value of i is:"+mc.geti());
    mc.seti(20);
    System.out.println("Value of i is now:"+mc.geti());

  }
}
