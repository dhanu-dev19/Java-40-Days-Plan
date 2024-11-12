package Day4;
import java.util.*;
public class ColorSearch {

	public static void main(String[] args) {
		
		String[] color={"red","blue","yellow","Safforn","green"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element(Do yo have Search!):");
		String element = "red";
		
		for(int i=0;i<color.length;i++) {
		  
			if(color[i]==element){
				System.out.println("Element is found at "+i+" Position");
			}
		}
			scan.close();
	}

}

