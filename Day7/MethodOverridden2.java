package Day7;

class SuperClass1{
  int i,j;
  
public SuperClass1(int a,int b){
  i = a;
  j = b;
}
void show(){
  System.out.println("i and j:"+i+" "+j);
}

}
class Subclass1 extends SuperClass1{
  int k;
   Subclass1(int a,int b,int c){
       super(a,b);
       k = c;
   }
   void show(String msg){ //Method Overridden from SuperClass.
       //Calls the Super class method.
    System.out.println(msg+k);
   }
}
public class MethodOverridden2 {
public static void main(String[] args) {
  Subclass1 subob = new Subclass1(10, 20, 15);
  subob.show();
  subob.show("This is k:");
}  
}
