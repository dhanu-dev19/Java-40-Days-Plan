package Day3;

class Test2{
  int a, b;

 /* Test2(int i,int j) // Here we use Constructor intialize
  {
    a = i;
    b = j;
  }*/

  void setInt(int a,int b){ //We can also use Encapsulation.
    this.a = a;
    this.b = b;
  }
  void meth(Test2 o)//Object as a Parameter
  {
    o.a *= 2;
    o.b /= 2;
  }
}
public class Call_by_refer {
  
  public static void main(String[] args) {

    Test2 obj1 = new Test2();
    obj1.setInt(10,20);
    System.out.println("Before Calling A and B:"+obj1.a+" "+obj1.b);

   //Refer to variables a and b.
    obj1.meth(obj1);
    System.out.println("After Calling A and B:"+obj1.a+" "+obj1.b);

  }
}
