package Day11;
interface Callback{
  void show();
}
abstract class Incomplete implements Callback
{
   int a, b;
   public void show(){
     System.out.println(a+" "+b);
   }

}
public class AbstractlassInter {
  public static void main(String[] args) {
     //Callback c = new Incomplete();
      System.out.println("ERROR:Incomplete does not implement callback() and must be declare Abstract");

  }
}
