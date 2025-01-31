package Day4;
import java.util.*;
public class ColorSearch {

	public static void main(String[] args) {
		
		String[] color={"red","blue","yellow","Safforn","green"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element(Do yo have Search!):");
		String element = scan.next();
		
		for(int index = 0; index<color.length; index++) {
		  
			if(color[index].equals(element)){
				System.out.println("Element is found at "+index+" Position");
			}
		}
			scan.close();
	}

}

