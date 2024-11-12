package Day24;

//Functional interface
interface MyNumber
{
   double getValue();
}
public class LamdaDemo 
{
  public static void main(String[] args) 
  {
    
    MyNumber myNum; //Declare an interface reference
     
    myNum = ()-> 123.45;

    //Call getValue Method
    System.out.println("A fixed value: "+myNum.getValue());

    //Here, more Complex Examples
    myNum = ()->Math.random()*100;

    System.out.println("A random Value:"+myNum.getValue());
    System.out.println("Another random Value:"+myNum.getValue());

    //Note:Error Because of type of Parameter must be compatible
    //System.out.println(myNum.getValue("Hi Darshan!!"));//Error!!!
  }
}
