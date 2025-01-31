package Day3;

class ObjectDemo
{
  int number;
   
  ObjectDemo(int i)
  {
    number = i;
  }
              
  //ReturnType:Object type of ObjectDemo
  ObjectDemo incrementTen()
  {
    ObjectDemo temp = new ObjectDemo(number + 10);
    return temp;  //Return type is Object type
  }
}
public class ObjectReturn {
    public static void main(String[] args) {
    ObjectDemo myDemo = new ObjectDemo(10);
    ObjectDemo myDemo2;
    System.out.println("Fisrt "+myDemo.number);
    myDemo2 = myDemo.incrementTen();
    System.out.println("Fisrt "+myDemo.number);
    System.out.println("second "+myDemo2.number);
  }
}
