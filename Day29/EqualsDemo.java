package Day29;

public class EqualsDemo {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Good-Bye";
    String s4 = "HELLO";

    System.out.println(s1+" equals "+s2+" -> "+s1.equals(s2));
    System.out.println(s3+" equals "+s4+" -> "+s3.equals(s4));
    System.out.println(s4+" equals ignore Case sensitive "+s1+" -> "+s1.equalsIgnoreCase(s2));

  }
  
}
