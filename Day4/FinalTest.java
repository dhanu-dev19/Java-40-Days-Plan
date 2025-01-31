package Day4;

public class FinalTest {
final int number1;
final int number2 = 10;
FinalTest(int number1){
  this.number1 = number1; 
} 
double SumNum(final int number1,final int number2){ //Final as number1 parameter.
  double sum = number1 + number2; //But we can't local varaiable as final because it prevent to assign the value
  return sum;
} 
public static void main(String[] args) {
  FinalTest demo = new FinalTest(25);
  //demo.number1 = 34;//It cannot intialize 
  System.out.println("value number1 is:"+demo.number1);
  System.out.println("Value number2 is:"+demo.number2);
  double vol = demo.SumNum(10, 20 );
  System.out.println("volume is:"+vol);

}
}
