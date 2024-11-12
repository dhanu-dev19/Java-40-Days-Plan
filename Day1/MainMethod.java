package Day1;

public class MainMethod {
   
  //Here we can use main as a method but also it works.
  //because main is also method builtIn method.
  public static void main(int number1, int number2 ){
    System.out.println("Result:"+ number1+number2 );//concat numbers 
    System.out.println("Result:"+(number1+number2));//sum of number
  }
  public static void main(String[] args) {
    main(10,20);
  }
  
}
