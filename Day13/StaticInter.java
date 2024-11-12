package Day13;
interface MYIf1{
  int getNumber();
  
 default String getString(){   //Must specify "default" When Implementing body of Method
   return "Default String";
 }
 static int getDefaultNumber(){
  return 100;
 }
}
class Inter implements MYIf1{
  public int getNumber(){
    return 10;
  }
}
public class StaticInter {
  public static void main(String[] args) {
    Inter ob = new Inter();
    //Implemented Method
    System.out.println(ob.getNumber());
    //Default Method
    System.out.println(ob.getString());
    //Static Method
    System.out.println(MYIf1.getDefaultNumber());
  }
}
