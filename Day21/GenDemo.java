package Day21;

class Gen<T>{
  T ob;

  //Pass the Constructor referance of type T

  Gen(T o){
    ob = o;
  }

  //Return ob

  T getOb(){
    return ob;
  }

  //show type T
  void showType(){
    System.out.println("Type of T is: "+ob.getClass().getName());
  }
}
public class GenDemo {
  public static void main(String[] args) {
    //Create a Gen reference for Integers
    //to encapsulates the value
    Gen<Integer> iob = new Gen<Integer>(88);

    //show the type of data used 
    iob.showType();

    //Get the value iob;
    int v = iob.getOb();
    System.out.println("Value: "+v);
    System.out.println();

    //Create a Gen object for strings.
    Gen<String> strOb = new Gen<String>("Hi Chanduu!!");

    //Show the type of data used by strOb
    strOb.showType();

    //Get value of strOb
    String str = strOb.getOb();
    System.out.println("Value: "+str);
  }
}
