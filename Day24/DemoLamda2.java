package Day24;

interface B
{
       int show1(int i);
}
public class DemoLamda2
{
  public static void main(String[] args) 
  {
    B obj = (int i) -> i+2;

    int result = obj.show1(5);

    System.out.println("Returned value from lamda expression: "+ result);
  }
}