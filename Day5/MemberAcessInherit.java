package Day5;
class Box1{
  double width;
  double height;
  double depth;

   //object as a  referance
   Box1(Box1 ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
   }

    Box1(double w,double h,double d)
  {  
    width = w;
    height = h;
    depth = d;
  }

  //Constructor used When no dimensions specified
   Box1()
  {
      width = -1;
      height = -1;
      depth = -1;
  }

  //Constructors used when one dimension specified
   Box1(double len)
  {
    height = width  = depth = len;
  }

  double volume(){
    return height*width*height;
  }
}
class BoxWeight extends Box1{
   double weight;
  BoxWeight(double w, double h,double d,double m){
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}
public class MemberAcessInherit {
  public static void main(String[] args) {
    BoxWeight mybox1 = new BoxWeight(20, 30, 40, 50);
    BoxWeight mybox2 = new BoxWeight(2.5, 3.4, 5.6, 7.8);
   
    double vol;
    vol = mybox1.volume();
    System.out.println("Value of box1:"+vol);
    System.out.println("Volume of box1:"+mybox1.weight);

    //Notice the difference 

    vol = mybox2.volume();
    System.out.println("Value of box1:"+vol);
    System.out.println("Volume of box1:"+mybox2.weight);



  }

}
