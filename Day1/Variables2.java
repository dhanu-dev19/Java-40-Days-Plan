package Day1;

public class Variables2 {
  public static void main(String[] args) {
    //Typcasting and TypeConversion

    /*Note:In Automatic conversion
      1.The two types are compatible like int to long not int to float.
      2.The destination type is larger than the source type.*/
    int number = 20;
    long age  = number;  //automatic conversion it is also called widdening conversion.
    System.out.println(age);

    number =(int) age; //Explicit conversion it is also called narrowing conversion.
    System.out.println(number);

    int year = 2024;
    byte year1 = (byte)year;  //This line code not work properly because size of byte is -127 to 128.
    System.out.println(year1);


    //Truncation: It means float value 2.13 is casting to integer it will store only floor value .13 is lost.
    float num = 2.34F;
    int floorValue = (int)num;
    System.out.println(floorValue);

    //Automatic Type Promotion in Expressions.
   // Note: The stored result must be larger than other type OtherWise explicitly typeCasting.
    byte a = 40;
    int b = 10;
    byte c = 20;
    int Result = a+c/b;
    System.out.println(Result);

    byte d = 50;
    //d = d*2;//Int cannot convert byte
     d = (byte) (d*2);
     System.out.println(d);

     //Note: We Can promote Char to int.
     char e = 'a';
     int f = (int) e;
     System.out.println(f);
     
     
  }
}
