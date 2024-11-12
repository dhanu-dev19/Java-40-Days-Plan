package Day5;

 class Box2
 {
  double width;
  double height;
  double depth;

   //object as a  referance
   Box2(Box1 ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
   }

    Box2(double w,double h,double d)
  {  
    width = w;
    height = h;
    depth = d;
  }

  //Constructor used When no dimensions specified
   Box2()
  {
      width = -1;
      height = -1;
      depth = -1;
  }

  //Constructors used when one dimension specified
   Box2(double len)
  {
    height = width  = depth = len;
  }

  double volume(){
    return height*width*height;
  }
}
class BoxWeight1 extends Box2{
   double weight;
  BoxWeight1(double w, double h,double d,double m){
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}
class ColorBox extends Box2{
  int color;

  ColorBox(double w, double h,double d,int c){
      width = w;
      height = h;
      depth = d;
      color = c;
  }
}
public class SuperClassReferanceVariable {
  public static void main(String[] args) {
    BoxWeight1 weightbox = new BoxWeight1(3, 5, 7, 8.37);
    Box2 plainbox = new Box2();

    double vol;
    vol = weightbox.volume();
    System.out.println("Volume of Weightbox is:"+vol);
    System.out.println("Volumne of weightbox of weight is:"+weightbox.weight);

    //assign boxweight referance to box referance

    plainbox = weightbox;

    vol = plainbox.volume();
    System.out.println("Volume of plainbox is:"+vol);
    System.out.println("Volumne of plainbox of weight is:"+weightbox.weight);
    //Weight can be accessed by the extends of super class.



  }
}
