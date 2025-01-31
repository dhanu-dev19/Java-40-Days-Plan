package Day3;

class Test2{
  int number1, number2;

 /* Test2(int i,int j) // Here we use Constructor intialize
  {
    number1 = i;
    number2 = j;
  }*/

  void setInt(int number1,int number2){ //We can also use Encapsulation.
    this.number1 = number1;
    this.number2 = number2;
  }
  void meth(Test2 o)//Object as number1 Parameter
  {
    o.number1 *= 2;
    o.number2 /= 2;
  }
}

public class Call_by_refer {
  
  public static void main(String[] args) {

    Test2 obj1 = new Test2();
    obj1.setInt(10,20);
    System.out.println("Before Calling A and B:"+obj1.number1+" "+obj1.number2);

   //Refer to variables number1 and number2.
    obj1.meth(obj1);
    System.out.println("After Calling A and B:"+obj1.number1+" "+obj1.number2);

  }
}
