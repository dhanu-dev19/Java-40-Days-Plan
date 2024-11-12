package Day29;

public class EqualIsNotEqualTo {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String(s1);

   System.out.println(s1+" equals "+s2+" ->"+s1.equals(s2));
   System.out.println(s1+" == "+s2+" -> "+(s1 == s2));

   //More Operations
   System.out.println("Result: "+"Foobar".endsWith("bar"));
   System.out.println("Result: "+"Foobar".startsWith("Foo"));

  }
}
