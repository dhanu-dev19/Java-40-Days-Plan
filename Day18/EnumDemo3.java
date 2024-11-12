package Day18;

enum Apple{
  Jonathan(10),GoldenDel(20),RedDel(30),Winesap(40),Cortland(50);

  private int price;

   Apple(int p){
    price = p;
  }
  int getPrice(){
    return price;
  }
}
public class EnumDemo3 {
  public static void main(String[] args) {
    Apple ap; //When created a Object or instanec type of enum it assign price value in constructor of 
    //all the constants with each copy we can access the price of each type of constants.

System.out.println("Winesap costs "+Apple.Winesap.getPrice()+" cents.\n");

    for(Apple a:Apple.values())
        System.out.println("costs "+a.getPrice()+" cents.\n");
  }
}
