package Day2;

 class ConstructorDemo1
{  double width;
   double height;
   double depth;
   
 /*I am Facing an issue called class name sholud same as file name of other class this naming conflict I
 I got an Error called:Exception in thread "main" java.lang.NoSuchMethodError: 'void Day2.ConstructorDemo.<init>(double, double, double)'
        at Day2.ConstructorOverload.main(ConstructorOverload.java:39)
PS C:\Users\Dhanush\OneDrive\Desktop\Javaprograms>  */



  //Note:The Outcome if we specified the dimensions or not specified the cube result will be appeared
  //Constructor used when all dimensions specified

   ConstructorDemo1(double w,double h,double d)
  {  
    width = w;
    height = h;
    depth = d;
  }

  //Constructor used When no dimensions specified
   ConstructorDemo1()
  {
      width = -1;
      height = -1;
      depth = -1;
  }

  //Constructors used when one dimension specifiecd
   ConstructorDemo1(double len)
  {
    height = width  = depth = len; //Remiander: Compund intialization
  }

  double volume(){
    return height * width * height;
  }
}
 public class ConstructorOverload {
 public static void main(String[] args) {

  //Overloading: The same constructor name with different parameters or different number of parameters
  ConstructorDemo1 ob1 = new ConstructorDemo1(17.0,45.4,3.4);
  ConstructorDemo1 ob2 = new ConstructorDemo1();
  ConstructorDemo1 mycube = new ConstructorDemo1(23.0);

  double vol;
  vol = ob1.volume();
  System.out.println("Volume is:"+ vol);

  vol = ob2.volume();
  System.out.println("Volume is:"+ vol);

  vol = mycube.volume();
  System.out.println("Volume is:"+ vol);


 }
  
}
