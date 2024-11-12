package Day3;

class ObejctDemo{
  double width;
  double height;
  double depth;

  public ObejctDemo(ObejctDemo ob)
  {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
   }
public ObejctDemo(double w,double h, double d){
     width = w;
     height = h;
     depth = d;
}

public ObejctDemo()
  {
    width = -1;
    height = -1;
    depth = -1;
}

public ObejctDemo(double len)
{
  height = width  = depth = len;
}

double volume(){
  return height*width*depth;
}

}

public class ObjectAsparameter2 {
  public static void main(String[] args) {
    ObejctDemo mybox4 = new ObejctDemo(34);
    ObejctDemo mybox5 = new ObejctDemo(54,67,75);
    ObejctDemo mybox6 = new ObejctDemo();
    ObejctDemo myclone = new ObejctDemo(mybox4);

    double vol;
  vol = mybox4.volume();
  System.out.println("Volume is:"+vol);

  vol = mybox5.volume();
  System.out.println("Volume is:"+vol);

  vol = mybox6.volume();
  System.out.println("Volume is:"+vol);
  //It will take input as object

  vol = myclone.volume();
  System.out.println("Volume is:"+vol);


  }
}
