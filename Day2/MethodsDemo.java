package Day2;

public class MethodsDemo {
  //Let's See the methods in Object_oriented.
  double height1;
  double width1;
  double depth1;

   void Volume(){
    System.out.println("Volme is:"+(height1*width1*depth1));
  }

  double Volume2(){
    return height1*width1*depth1;
  }
}
 class BoxDemo1{

    public static void main(String[] args) {

      MethodsDemo mymethod1 = new MethodsDemo();
      MethodsDemo mymethod2 = new MethodsDemo();

      mymethod1.height1 = 20;
      mymethod1.width1 =  20;
      mymethod1.depth1 = 30;
      //Calling or invoke method using object:mymethod1
      mymethod1.Volume();

      mymethod2.height1 = 5.0;
      mymethod2.width1 = 7.0;
      mymethod2.depth1 = 56.7;
      //Calling or invoke method using object:mymethod1
      mymethod2.Volume();


      //Returning methods
      double result = mymethod2.Volume2();
      System.out.println("Returned value is:"+result);

    }
  }

