package Day15;
import java.util.regex.*;

public class RegexDemo {
public static void main(String[] args) {
  String text = "The quick brown fox jumps over the lazy dog.";
  String pattern = "fox";

  Pattern p = Pattern.compile(pattern);
  Matcher m = p.matcher(text);
  
  if(m.find()){
    System.out.println("Pattern found!");
  }
  else{
    System.out.println("Pattern not found.");
  }

}  
}
