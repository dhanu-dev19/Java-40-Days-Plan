import java.util.Scanner;

public class MergeArray {
  public static int[] combineArrays(int[] a1, int[] a2, int n) {
    // Write code here
    //int length1 = a1.length;
    //int length2 = a2.length;
    //int[] combine = new int[length1+length2];
   /*  for( i =0;i<n;i++){
      combine[i] = a1[i];
    }*/
    for(int j = 0;j<n;j++){
      a1[n+j] = a2[j];
    }
    return a1;
}
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int[] a1 = new int[10];
  int[] a2 = new int[10];
  System.out.println("Enter the array element");
  for(int i=0;i<3;i++){
    a1[i]=scan.nextInt(); 
  }
for(int j=0;j<3;j++){
  a2[j] = scan.nextInt();
}
  int a3[] = combineArrays(a1,a2,3);
  int n1 = 6;
  System.out.print("[ ");
  for(int i=0;i<n1;i++){
    System.out.print(a3[i]+" ");
  }
  System.out.print("]");
}
}
