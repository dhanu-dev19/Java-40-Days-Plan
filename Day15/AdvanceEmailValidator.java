package Day15;
import java.util.regex.*;
public class AdvanceEmailValidator {
  public static void main(String[] args) {
    String email = "user@example.com";
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);

    if(matcher.matches()){
      System.out.println("Valid email address");
    }
    else{
      System.out.println("Invalid email address");
    }
  }
}
