package Day1;

import java.util.Scanner;

public class DataType2 
{
  public static void main(String[] args) 
  {
    //In this Program we can see naming conflict between local variables
    //And Assign number to correct dataType According to the value or number to Save Memory space

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    long number1 = scanner.nextLong();
    if(number1 >= -128 && number1 <= 127)
    {
       byte number =(byte)number1;
       System.out.println("I am byte:"+number);
    }
   else if(number1 >= -32768 && number1 <= 32767)
   {
      short number =(short) number1;
      System.out.println("I am Short:"+number);
   }
  else if(number1 >= -2147483648 && number1 <= 2147483647)
  {
      int number = (int)number1;
      System.out.println("I am Int:"+number);
   }
   else 
      System.out.println("I am Long:"+number1);
      scanner.close();

      //Unicode
      char ch1 = 56 ,ch2 = 'C';
    ;System.out.print(ch1+" "+ch2);
    ch2++;
    System.out.println(ch2);
      //Note: If we miss "+" error will be like:Syntax error on token "ch2", delete this tokenJava(1610612968)
   }

 /*It Will give error like this :Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Duplicate local variable number
        Duplicate local variable number
        Duplicate local variable number
        Duplicate local variable number

        at Day1.DataType2.main(DataType2.java:16)*/

  }


