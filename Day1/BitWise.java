package Day1;

public class BitWise {
  public static void main(String[] args) {
    //BitWise operator
    int x=10,y=20,z;
    z = x & y;
    System.out.println(z);
     z = x | y;
    System.out.println(z);
    z = ~x;
    System.out.println(z);
    z = x >> 2;   //Bit shift Operators right
    System.out.println(z);
    z = x << 2;   //Bit shift Operators light
    System.out.println(z);
    z = x ^ y;
    System.out.println(z);

  }
}
