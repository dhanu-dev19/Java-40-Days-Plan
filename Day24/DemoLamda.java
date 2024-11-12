package Day24;

interface A
{
   void show(int i);
}
public class DemoLamda {
  public static void main(String[] args) {
    //Lamda Expression "->"
    A obj = (int i) -> {
    System.out.println("Hi Chandu!!!");
    System.out.println("Value:"+ i);
    };
          obj.show(5);
     
  }
}
