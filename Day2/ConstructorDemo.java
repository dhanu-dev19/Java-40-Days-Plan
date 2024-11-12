package Day2;

 class Constructor {
  double height;
  double width;
  double depth;
  double len;
  double length;

  public Constructor() //Default Constructor
  {
    height = 10;
    width = 20;
    depth = 5;
  }
  public Constructor(double h,double w,double d)
  {
    height = h;
    width = w;
    depth = d;
  }
  public Constructor(double height,double width,double depth,double length){
    this.height = height;
    this.width = width;
    this.depth = depth;
    this.length = length;
  }
  //This keyword refer to current objectb without naming conventtion or hiding the local variable

  double volume()
  {
   return height*depth*width;
  }
}

public class ConstructorDemo{
  public static void main(String[] args) {
    Constructor box1 = new Constructor();
    Constructor box2 = new Constructor();
    Constructor box3 = new Constructor(45,60,15);
    Constructor box4 = new Constructor(7.0,8.5,6.9);

    Constructor box5 = new Constructor(34,56,74,3);

    double vol;
    vol = box1.volume();
    System.out.println("Volume is:"+vol);

    vol = box2.volume();
    System.out.println("Volume is:"+vol);

    System.out.println("Without Assign Value:"+box1.len);//Instance variable have their default values will be "Zero,Null or Flase."
   
   
    //Parametrized Constructor
    
    vol = box3.volume();
    System.out.println("Volume is:"+vol);

    vol = box4.volume();
    System.out.println("Volume is:"+vol);

    vol = box5.volume();
    System.out.println("volume is:"+vol);
  }
}
