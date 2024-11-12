import java.util.Scanner;

public class SelectionSearch {

	public void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minval = arr[i];
			int minidx = i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<minval) {
					arr[j] = minval;
					minidx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;
	}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		SelectionSearch obj = new SelectionSearch();
		//int[] arr = new int[8];
		int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
		obj.selection(arr);
	}
}

