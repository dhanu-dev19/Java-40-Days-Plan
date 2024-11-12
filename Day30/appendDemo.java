package Day30;

public class appendDemo {
  public static void main(String[] args) {
    String s;
    int a = 42;
    StringBuffer sb = new StringBuffer(40);//specifying capacity of the String buffer.....
    s = sb.append("a = ").append(a).append("!").toString();
    System.out.println(s);

  }
}
