package Day14;

public class Nestedtry2 {
  static void nestedtry(int a){
    try{
      if(a==1)
      a = a/(a-a);
  
    if(a==2){
       int[] c = {1};
       c[42] = 99;
        }
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array bound Exception:"+e);
    }
   
  }
  public static void main(String[] args) {
    try{
      int a = args.length;

        int b = 42/a;
        System.out.println("Vlaue:"+a);
        nestedtry(a);
    }catch(ArithmeticException e){
      System.out.println("Divide by 0:"+e);
    }
  }
}
