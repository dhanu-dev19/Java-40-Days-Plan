import java.util.*;

public class SecondlargestNum {

  public static int secondLargest(int[] nums) {

    /*Logic to find 2nd largest number
     1.Sort the Array using Bubble sort technique
     2.And find the second largest element by using index-1
     */
    
   int n = nums.length; 
    for(int i=0;i<n-2;i++){
        for(int j=0;j<n-1-i;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j]= nums[j+1];
                nums[j+1]= temp;
            }
        }
    }
    int result = nums[n-2];
    return result;
}  
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter the Size of list:");
  int size = scan.nextInt();

  int[] collectionOfNum = new int[50];
  for(int i=0;i<size;i++){

  }
  int result = secondLargest(nums);
  System.out.println(result);
}

}

