package Day23;

class Gen<T>{
  T ob; //declares an object of type T

  //Pass the Constructor a referances
  Gen(T o){
    ob = o;
  }

  //Return ob.
  T getOb(){
    return ob;
  }
}
public class RawDemo {
  public static void main(String[] args) {
    //Create a Gen object for Integers.
    Gen<Integer> iOb = new Gen<Integer>(88);
    Gen<String> strOb = new Gen<String>("Generics Test");

    //Create raw object of Gen
    Gen raw = new Gen(Double.valueOf(98.6));

    double d = (Double) raw.getOb();
    System.out.println("Value: "+d);

    //int i = (Integer) raw.getOb(); //run-time error

    strOb = raw;  //Potentially wrong !!!
    //String str = strOb.getOb();//Run-time error

  }
}
