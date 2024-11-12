package Day4;

public class FinalTest {
final int a;
final int b = 10;
FinalTest(int a){
  this.a = a; 
} 
double SumNum(final int a,final int b){ //Final as a parameter.
  double sum = a+b; //But we can't local varaiable as final because it prevent to assign the value
  return sum;
} 
public static void main(String[] args) {
  FinalTest demo = new FinalTest(25);
  //demo.a = 34;//It cannot intialize 
  System.out.println("value a is:"+demo.a);
  System.out.println("Value be is:"+demo.b);
  double vol = demo.SumNum(10, 20 );
  System.out.println("volume is:"+vol);

}
}
