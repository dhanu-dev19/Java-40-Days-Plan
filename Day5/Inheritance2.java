package Day5;
class Main1{
  int i;
  private int j;//When make it as private it can't inherit to the next class.
  int k;
  void setij(int i, int j,int k){
    this.i = i;
    this.j = j;
    this.k = k;
  }
  void printj(){
    System.out.println("Value j:"+j);
  }
 int getj(){
  return j;
 }
}
class Main2 extends Main1{
  Main1 ob2 = new Main1();
  int j = ob2.getj();  // I get the value private value of J using encapsulation and Constructor.
  int total;

  void sum(){
    total = i+k+j;//Error j is not visible
    System.out.println("Total is:"+total);
  }
}
public class Inheritance2 {
  public static void main(String[] args) {
    Main2 ob1 = new Main2();
    ob1.setij(10,20,30);
    ob1.sum();
    ob1.printj();

  }
}
