package Day32;
import java.util.*;
public class MergeCharArray 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Two String To be insert");
    String str1 = scanner.nextLine();
    String str2 = scanner.nextLine();
    char[] result = new char[str1.length()+str2.length()-1];
    char[] word1 = str1.toCharArray();
    char[] word2 = str2.toCharArray();
    int i = 0;
    int j = 0;

    while(i < str1.length() && j < str2.length()){

         if(i <= j)
         {
           result[i] = word1[i];
           i++;
         }
         else
         {
          
           result[i] = word2[i];
           i++;
           
         }   
      }

      for( i = 0;i<result.length;i++){
        System.out.println(result[i]);
      }

      scanner.close();
  }
}
