import java.util.ArrayList;
import java.util.Scanner;
public class KeithNumber {
       static boolean keith(int x) {
    	   
    	   ArrayList<Integer>terms = new ArrayList<Integer>();
    	   int temp = x,n=0;
           while(temp>0){
            terms.add(temp%10);
            temp = temp/10;
            n++;
           }
		   Collections.reverse(terms);
		   int next_term = 0,i=n;

		   while(next_term<x){
			next_term=0;
			for(int j=1;j<=n;j++){
				next_term=next_term+terms.get(i-j);
				terms.add(next_term);
				i++;
			}
		   }
		   return(next_term==x);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
	}
}
