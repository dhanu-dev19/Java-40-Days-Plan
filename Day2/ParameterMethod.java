package Day2;

class ParameterMethod {
  
  double height;
  double width;
  double depth;

  double Volume1()
  {
    return height * depth * width;
  }
  public void setDim(double w,double h,double d){
    width = w;
    height = h;
    depth = d;
  }

}

 class ParameterDemo{
  public static void main(String[] args) {
    ParameterMethod para1 = new ParameterMethod();
    ParameterMethod para2 = new ParameterMethod();

    para1.setDim(12.0,45.0,60.0);
    para2.setDim(30,40,30);

    System.out.println("Result of box1:"+para1.Volume1());
    System.out.println("Result of bo2:"+para2.Volume1());
  }
}
