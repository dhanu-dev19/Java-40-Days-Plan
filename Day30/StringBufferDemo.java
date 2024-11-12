package Day30;

//StringBuffer length vs. capacity.

public class StringBufferDemo 
{
  public static void main(String[] args) 
  {
    StringBuffer sb = new StringBuffer("Hello");

    System.out.println("buffer = "+sb);
    System.out.println("length = "+sb.length());
    System.out.println("capacity = "+sb.capacity());
    // capacity  = 21 : when created its length is 5.
    // Its capacity is 21 because room for 16 additional character is automatically added..

  }
}
