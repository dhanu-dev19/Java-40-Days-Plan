package Day3;

class ObjectDemo
{
  int a;
   
  ObjectDemo(int i)
  {
    a = i;
  }
              
  //ReturnType:Object type of ObjectDemo
  ObjectDemo incrementTen()
  {
    ObjectDemo temp = new ObjectDemo(a+10);
    return temp;
  }
}
public class ObjectReturn {
  
  public static void main(String[] args) {
    ObjectDemo myDemo = new ObjectDemo(10);
    ObjectDemo myDemo2;
    System.out.println("Fisrt "+myDemo.a);
    myDemo2 = myDemo.incrementTen();
    System.out.println("Fisrt "+myDemo.a);
    System.out.println("second "+myDemo2.a);
  }
}
