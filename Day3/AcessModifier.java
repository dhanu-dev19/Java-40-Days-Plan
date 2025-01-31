package Day3;

class AcessDemo{
  int a;
  public int b;
  private int c;

  void setc(int i)
  {
    c = i;
  }
  int getc()
  {
    return c;
  }
}
public class AcessModifier {
  public static void main(String[] args) {
    AcessDemo oDemo = new AcessDemo();

    oDemo.a = 10;
    oDemo.b = 20;
  /*oDemo.c = 30;//Error Private varaible scope will be only within the class.
    //Error like this:Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The field AcessDemo.c is not visible*/

    oDemo.setc(5);
    int res = oDemo.getc();//private data  will be get by using get method and return
    System.out.println("Value A:"+oDemo.a);//Default varaiable can be accesesed
    System.out.println("Value B:"+oDemo.b);//Public varaiable is visble everywhere.
    System.out.println("Result:"+res);
  }
  

}
