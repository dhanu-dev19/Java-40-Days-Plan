package Day28;


class Box
{
  double width;
  double height;
  double depth;

  Box(double w,double h,double d)
  {
    width = w;
    height = h;
    depth = d;
  }

  public String toString(){
    return "Dimensions are "+width+" by "+depth+" by "+height+".";
  }
} 
  
public class toStringDemo {

 public static void main(String[] args) {
  Box b = new Box(10, 12, 14);
  String s = "Box b: "+b;//Concatenate Box Object

  System.out.println(b);//Convert Box to string
  System.out.println(s);

 } 
}
