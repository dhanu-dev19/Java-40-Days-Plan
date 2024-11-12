package Day21;

class TwoGen<T , V>{
  T ob1;
  V ob2;

  TwoGen(T o1,V o2){
    ob1 = o1;
    ob2 = o2;
  }
  //Show all types of T and V
  void showType(){
    System.out.println("Type T is:"+ob1.getClass().getName());
    System.out.println("Type V is:"+ob2.getClass().getName());
  }
//Get values form the references
  T getOb1(){
    return ob1;
  }
  V getOb2(){
    return ob2;
  }
      
}
public class SimpGen {
public static void main(String[] args) {
  TwoGen<Integer,String> tgobj = new TwoGen<Integer,String>(88,"Hi Chandu!!!");

  //Show the types
  tgobj.showType();

  //Obtain and Show values
  int value = tgobj.getOb1();
  System.out.println("value:"+value);

  String str = tgobj.getOb2();
  System.out.println("Value of V:"+str);
}  
}
