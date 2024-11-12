package Day15;
import java.util.regex.*;
public class RegxDemo1 {
 public static void main(String[] args) {
  Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
  Matcher matcher = pattern.matcher("Visit w3schools");
  boolean MatchFound = matcher.find();
  if(MatchFound){
    System.out.println("Valid pattern");
  }
  else{
    System.out.println("In valid pattern");
  }
 } 
}
