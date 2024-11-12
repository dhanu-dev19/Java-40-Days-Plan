package Day27;

interface MyFunc<T>
{
  MyClass<T> func(T n);
}

class MyClass<T>{
  private T val;

  //A consturctor that takes an argument..
  MyClass(T v){
    val = v;
  }

  MyClass(){
    val = null;
  }

  T getval(){
    return val;
  }
}
public class ConstructorDemoRef3 {
  public static void main(String[] args) {
    MyFunc<Integer> myclassCons = MyClass<Integer>::new;

    MyClass<Integer> mc = myclassCons.func(100);

    System.out.println("val in mc is "+mc.getval());
  }
}
