package Day23;

class Gen4<T>{
  T ob;

  Gen4(T o){
    ob = o;
  }

  T getOb(){
    return ob;
  }
}

//Subclass of gen that defines a Second
class Gen5<T, V> extends Gen4<T>{
  V ob2;

  Gen5(T o,V o2){
    super(o);
    ob2 = o2;
  }

  V getOb2(){
    return ob2;
  }
}
public class HierDemo {
  public static void main(String[] args) {
    Gen5<String,Integer>x = new Gen5<String,Integer>("Value is: ",99);

    System.out.print(x.getOb());
    System.out.println(x.getOb2());
  }
}
