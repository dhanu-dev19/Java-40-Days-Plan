package Day19;

public class AutoBoxingDemo {
  //Take an Integer parameter and return
  static int m(Integer v){
    return v;   //Auto-Unbox to int
  }
 public static void main(String[] args) {
  //pass an int to m() and assign the return value.
  //to an Integer Here, the argument 100 is autoboxed.
  Integer iOb = m(100);

  System.out.println("Auto-Unboxed:"+iOb);
 }
}
