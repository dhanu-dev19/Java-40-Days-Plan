package Day29;

public class indexOfDemo {
  public static void main(String[] args) {
    
    String s = "Now is the time for all good men "+" to come to aid of their country ";

    System.out.println("index of 't' = "+s.indexOf('t'));
    System.out.println("index of 't' = "+s.lastIndexOf('t'));
    System.out.println("index of 'the' = "+s.indexOf("the"));
    System.out.println("index of 't' = "+s.indexOf('t',10));
  }
}
