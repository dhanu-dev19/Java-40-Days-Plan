package Algo365;
import java.util.*;
public class DataType {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the test cases:");
    int test = scanner.nextInt();
    System.out.println("Enter the number to know the datatypes that can fitted or not fitted:");
    //long number = 0 ;
   for(int i=0;i<test;i++){
      try{
      long  number = scanner.nextLong();
      System.out.println(number+" can be fitted in:");
      if(number>=Byte.MIN_VALUE && number<=Byte.MAX_VALUE){
              System.out.println("* byte");
      }
      if(number>=Short.MIN_VALUE && number<=Short.MAX_VALUE){
             System.out.println("* short");       
      }
      if(number>=Integer.MIN_VALUE && number<=Integer.MAX_VALUE){
             System.out.println("* int");    
      }
      if(number>=Long.MIN_VALUE && number<=Long.MAX_VALUE){
             System.out.println("* long");    
      }
     
     }
     catch(Exception e){
        System.out.println(scanner.next()+"can't be fitted anywhere.");     
     }
  }
scanner.close();   
  }
}
