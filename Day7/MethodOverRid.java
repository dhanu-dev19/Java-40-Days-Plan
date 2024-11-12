package Day7;

class SuperClass{
  int i,j;
  
public SuperClass(int a,int b){
  i = a;
  j = b;
}
void show(){
  System.out.println("i and j:"+i+" "+j);
}

}

class Subclass extends SuperClass{
  int k;
   Subclass(int a,int b,int c){
       super(a,b);
       k = c;
   }
   void show(){ //Method Overridden from SuperClass.
    super.show();   //Calls the Super class method.
    System.out.println("k:"+k);
   }
}
public class MethodOverRid {
  public static void main(String[] args) {
    Subclass subob = new Subclass(10, 20, 15);
    subob.show();
  }
}
