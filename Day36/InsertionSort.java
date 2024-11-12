import java.util.*;
public class InsertionSort {

  //implementation insertion sort technique
  public static void insertionSort(int array[],int n){
   int i,j=0;
   for(i=1;i<n;i++){
       int key = array[i];
       j=i-1;
  while(j>=0 && array[j]>key){
       array[j+1] = array[j];
       j=j-1;
  }
  array[j+1] = key;
  }
  System.out.println("Result will be:");
  for(i=1;i<n;i++){
    System.out.println(array[i]);
    }
}
 public static void main(String[] args) {
  System.out.println("Enter the input to the Array:");
 Scanner scan = new Scanner(System.in);
 int[] array = new int[20];
 int n= 6;
 for(int i=0;i<n;i++){
   array[i] = scan.nextInt();
 } 
 insertionSort(array,n);
 scan.close();
  }

}
