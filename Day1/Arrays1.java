package Day1;

import java.util.Scanner;

public class Arrays1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] month_days = new int[20]; //We cannot intialize the  values because values intialize only when declaration
    //Note: initialally all postions are Zero.
    int Arrays[] = {1,3,4};
    System.out.println("Enter the number days in Months.");
    for(int i=0;i<12;i++){
      month_days[i] = scanner.nextInt();
    }
    System.out.println("Months dates will be:");
    for(int i=0;i<=12;i++){
      System.out.println("Month:"+i+" "+month_days[i]);
    }
    
  }
}
