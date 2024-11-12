package Day26;

//Note:Doubt Cleared once cross check with the packages
interface MyFunc3
{
  MyClass func(int n);
}

class MyClass{

  private int val;

  MyClass(){
    val = 0;
  }
  MyClass(int v){
    val = v;
  }

  int getVal(){
    return val;
  }
}
public class ConstructorRefDemo {
  public static void main(String[] args) {
    
    //Create a references to the Myclass constructor..
    MyFunc3 myclassCons = MyClass :: new ;
    
   //Create an instance of myclass via that constructor reference..
    MyClass mc = myclassCons.func(100);
    
    System.out.println("val in mc is "+mc.getVal());

  }
}
