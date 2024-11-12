package Algo365;
import java.util.Scanner;
public class UniqueElements {
  
  public static boolean IsElementUnique(int array[]){
    int i,j;
    for(i=0;i<array.length-2;i++){

      for(j=i+1;j<array.length-1;j++){
         if(array[i]==array[j])
            return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[8];
    System.out.println("Enter the elemnets to array");
    for(int i=0;i<array.length;i++){
      array[i]=scanner.nextInt();
    }
    boolean result = IsElementUnique(array);
    System.out.println("Result: "+result);
    scanner.close();
  }
}
