package Day13;
interface MYIF 
{
  int getNumber();
  
 default String getString(){   //Must specify "default" When Implementing body of Method
   return "Default String";
 }
}
class MyIFImp implements MYIF{

  public int getNumber(){
    return 10;
  }

  /*default String getString(){
//Error:Default methods are allowed only in interfaces.Java(67109922) and method is not visible.
  }*/
public String geString(){
  return "Public String";
}
}
public class DefaultIFMethod {
  public static void main(String[] args) {
    MyIFImp obj = new MyIFImp();
    //Implemented Method
    System.out.println(obj.getNumber());
    //Default Method
    System.out.println(obj.getString());
  }
}
