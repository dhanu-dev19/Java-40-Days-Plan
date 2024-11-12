package Day2;

class OverloadDeamo{
  //Note:No Complier decide based on parameters and data type since return type do not play role in method 
  //Overloading
  //Compiler will decide which type of method to be invoked at the time of invocation. 
  void test(){
    System.out.println("No parametrs");
  }
  void test(int a){
    System.out.println("a :"+a);
  }
  void test(int a,int b){
    System.out.println("a and b:"+a+" "+b);
  }
  double test(double a){
    System.out.println("double a:"+a);
    return a*a;
  }

  //Type Conversion 
  void test(double a,double b,double c){ //When I am Assigning integer it implicitly conversion to double type.
    System.out.println("Double a:"+a+",b:"+b+",c:"+c);
  }
}

public class Overload {
  public static void main(String[] args) {
    OverloadDeamo object = new OverloadDeamo();

    object.test();
    object.test(12.0);//It will invoke double test(double a) that's why return type no matter in method overloading
    object.test(12);
    object.test(3,2);
   double result = object.test(12.0);
   System.out.println("Result:"+result);
   object.test(5,6,7);

  }
}
