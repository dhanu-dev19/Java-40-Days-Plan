package Day14;

public class FinallyDemo {
  static void procA(){
    try{
      System.out.println("inside ProcA");
      return;
    }finally{
      System.out.println("ProcA's Finally");
    }
  }
  static void procB(){
    try{
      System.out.println("inside ProcB");
      return;
    }finally{
      System.out.println("ProcB's Finally");
    }
  }
  static void procC(){
    try{
      System.out.println("inside ProcC");
      return;
    }finally{
      System.out.println("ProcC's Finally");
    }
  }
  public static void main(String[] args) {
    try{
      procA();
    }catch(Exception e){
      System.out.println("Exception Caught");
    }
      procB();
      procC();
   }
}
