package Day6;

class A1{
  double depth;
  double height;
  double width;

  A1(A1 ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
   }
  A1(double w,double h,double d)
  {  
    width = w;
    height = h;
    depth = d;
  }

  //Constructor used When no dimensions specified
   A1()
  {
      width = -1;
      height = -1;
      depth = -1;
  }

  //Constructors used when one dimension specified
   A1(double len)
  {
    height = width  = depth = len;
  }

  double volume(){
    return height*width*height;
  }
}
class BoxWeight2 extends A1{
   double weight;
  BoxWeight2(BoxWeight2 ob){
    super(ob);
    weight = ob.weight;
  }
  BoxWeight2(){
    super();
    weight = -1;
  }
  BoxWeight2(double h,double w,double d,double m){
     super(w,h,d);
     weight = m;
  }
  BoxWeight2(double len,double weight){
      super(len);
    this.weight = weight;
  }
   void print(){
    System.out.println("width will be:"+super.width);
  }
  
}

public class SuperDemo {
  public static void main(String[] args) {
    BoxWeight2 mybox1 = new BoxWeight2(10,20,15,34.5);
    BoxWeight2 mybox2 = new BoxWeight2(mybox1);
    BoxWeight2 mybox3 = new BoxWeight2(30,45);
    BoxWeight2 mybox4 = new BoxWeight2();
  
    double vol;
  
    vol = mybox1.volume();
    System.out.println("volume of mybox1:"+vol);
    
    vol = mybox2.volume();
    System.out.println("volume of mybox2 referance of mybox1:"+vol);

    vol = mybox3.volume();
    System.out.println("volume of mybox3:"+vol);

    vol = mybox4.volume();
    System.out.println("volume of mybox4:"+vol);
   //System.out.println("Weight is:"+mybox1.weight); Is not visible
   
    mybox1.print();
  }
  
}
