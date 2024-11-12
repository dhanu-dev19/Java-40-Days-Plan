package Day23;


class Gen6<T>{
  T ob;

  Gen6(T o){
    ob = o;
  }

  T getOb(){
    System.out.println("Gen's getOb():");
    return ob;
  }
}

class Gen7<T>extends Gen6<T>{
  Gen7(T o){
    super(o);
  }

  T getOb(){
    System.out.println("Gen2's getOb():");
    return ob;
  }
}
public class OverrideDemo {
  public static void main(String[] args) {
    
    //Create a Gen object for integers
    Gen6<Integer> iOb = new Gen6<Integer>(88);

    //Create a Gen2 object for Integers

    Gen7<Integer> iOb2 = new Gen7<Integer>(99);

    Gen7<String>strOb2 = new Gen7<String>("Generics Test");

    System.out.println(iOb.getOb());
    System.out.println(iOb2.getOb());
    System.out.println(strOb2.getOb());
  }
}
