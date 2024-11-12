package Day11;

//import javax.security.auth.callback.Callback;

interface DemoI
{
  public void callback(int pram);
}
class Client implements DemoI
{

  public void callback(int p){  //Error When we declare default modifier:Cannot reduce the visibility of the inherited method from DemoI
    System.out.println("callback called with "+p);
  }

  void nonIfaceMeth(){
    System.out.println("Classes thatimplement interfaces "+"may also define other members, too.");
  }

}
class AnotherClient implements DemoI{

  public void callback(int p){
    System.out.println("Another Client calss");
    System.out.println("Callback Value of Another Client:"+p);
  }
}
class Client2 extends Client
{

  public void callback(int p){
    System.out.println("call back called with2:"+p);
  }
}
public class TsetInterFace 
{
  public static void main(String[] args)
  {
     DemoI c = new Client();
     AnotherClient a = new AnotherClient();
     Client2 d = new Client2();
     c.callback(2);
     d.callback(5);
     d.nonIfaceMeth(); //Interface and inheritance Concepts together 
  }
}
