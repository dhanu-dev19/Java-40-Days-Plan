package Day22;

 class GenCons {
  private double val;

  <T extends Number>GenCons(T arg){
    //Constructor call declaration
    val = arg.doubleValue();
  }
  void showVal(){
  System.out.println("val:"+val);
  }
}  
public class GenConsDemo{
public static void main(String[] args) {
  GenCons testcase1 = new GenCons(100);
  GenCons testcase2 = new GenCons(123.5F);

  testcase1.showVal();
  testcase2.showVal(); 
}
}
