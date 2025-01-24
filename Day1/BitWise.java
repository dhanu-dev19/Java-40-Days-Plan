package Day1;

public class BitWise {
  public static void main(String[] args) {
    //BitWise operator
    int input1 = 10,input2 = 20, result;
    result = input1 & input2;
    System.out.println("Bitwise AND:"+result);
     result = input1 | input2;
    System.out.println("Bitwise OR:"+result);
    result = ~input1;
    System.out.println("Bitwise NOT:"+result);
    result = input1 >> 2;   //Bit shift Operators right
    System.out.println("Bitwise Right Shift:"+result);
    result = input1 << 2;   //Bit shift Operators light
    System.out.println("Bitwise Light Shift:"+result);
    result = input1 ^ input2;
    System.out.println("Bitwise input1 XOR:"+result);

  }
}
