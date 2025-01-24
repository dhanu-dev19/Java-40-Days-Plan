package Day35;
import java.util.ArrayList;
import java.util.Collections;
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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		if(keith(num)){
			System.out.println("Yes ! it is keith number");
		}
		else{
			System.out.println("NO! It is not");
		}
		scan.close();
	}
}
