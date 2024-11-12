package Day6;
class Box3{

  private double depth;
  private double height;
  private double width;

  Box3(Box3 ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
   }
  Box3(double w,double h,double d)
  {  
    width = w;
    height = h;
    depth = d;
  }

  //Constructor used When no dimensions specified
   Box3()
  {
      width = -1;
      height = -1;
      depth = -1;
  }

  //Constructors used when one dimension specified
   Box3(double len)
  {
    height = width  = depth = len;
  }

  double volume(){
    return height*width*height;
  }
}
class BoxWeight3 extends A1{
   double weight;

  BoxWeight3(BoxWeight3 ob){
    super(ob);
    weight = ob.weight;
  }
  BoxWeight3(){
    super();
    weight = -1;
  }
  BoxWeight3(double h,double w,double d,double m){
     super(w,h,d);
     weight = m;
  }
  BoxWeight3(double len,double weight){
      super(len);
    this.weight = weight;
  }
 /* void print(){
    System.out.println("width will be:"+super.width);
  }*/
  
}

class Shipment extends BoxWeight3{
  double cost;

  Shipment(Shipment ob1){
    super(ob1);
    cost = ob1.cost;
  }
  Shipment(){
    super();
    cost = -1;
  }
  Shipment(double h,double w,double d,double m ,double c){
     super(w,h,d,m);
     cost = c;
  }
  Shipment(double len,double weight,double cost){
      super(len,weight);
    this.cost = cost;
  }
}

public class MultiHeirarchy {
 public static void main(String[] args) {
  Shipment shipment1 = new Shipment();
  Shipment shipment2 = new Shipment(10,20,3.7,4.8,6);
  Shipment shipment3 = new Shipment(shipment1);
double vol;

vol = shipment1.volume();
System.out.println("volume of shipment1:"+vol);
System.out.println("Weight of Shipment1:"+shipment1.weight);

vol = shipment2.volume();
System.out.println("volume of shipment2:"+vol);
System.out.println("Weight of Shipment2:"+shipment2.weight);

vol = shipment3.volume();
System.out.println("volume of shipment3:"+vol);
System.out.println("Weight of Shipment3:"+shipment3.weight);
 } 
}
