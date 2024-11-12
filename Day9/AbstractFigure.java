package Day9;
abstract class Figure1 {
  double dim1;
  double dim2;
Figure1(double a,double b){
  dim1 = a;
  dim2 = b;
}
abstract double area();
}
class Rectangle extends Figure1{

  Rectangle(double a,double b){
    super(a, b);
  }
  double area(){
    System.out.println("Inside Area for Rectangle.");
    return dim1 * dim2;
  }
}
class Triangle extends Figure1{
  
  Triangle(double a, double b){
    super(a, b);
  }

  double area(){
    System.out.println("Inside Area for Triangle.");
    return dim1 * dim2/2;
  }
}
public class AbstractFigure {
  public static void main(String[] args) {
    //Figure1 f = new Figure1(10, 10); illegal 
    Rectangle r = new Rectangle(9, 5);
    Triangle t = new Triangle(10, 8);
    
    Figure1 figref;  //This is Ok no object created.it is now abstract it is a referance variable.

    figref = r;  // referance of rectangle.
    System.out.println("Area is:"+ figref.area());

    figref = t;  // referance of triangle.
    System.out.println("Area is:"+figref.area());

    /*figref = f;  // referance of same constructor.
    System.out.println("Area is:"+figref.area());*/
  }
}


