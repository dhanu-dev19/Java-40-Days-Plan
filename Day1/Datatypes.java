package Day1;

public class Datatypes {

public static void main(String[] args) 
{
  //Determine the Size of each Data type using Java Wrapper Class.

  System.out.println("Size of Min: "+(Byte.MIN_VALUE)+"\t Size of Max: "+(Byte.MAX_VALUE));
  System.out.println("Size of Min: "+(Short.MIN_VALUE)+"\t Size of Max: "+(Short.MAX_VALUE));
  System.out.println("Size of Min: "+(Character.MIN_VALUE)+"\t Size of Max: "+(Character.MAX_VALUE));
  System.out.println("Size of Min: "+(Integer.MIN_VALUE)+"\t Size of Max: "+(Integer.MAX_VALUE));
  System.out.println("Size of Min: "+(Long.MIN_VALUE)+"\t Size of Max: "+(Long.MAX_VALUE));
  System.out.println("Size of Min: "+(Float.MIN_VALUE)+"\t Size of Max: "+(Float.MAX_VALUE));
  System.out.println("Size of Min: "+(Double.MIN_VALUE)+"\t Size of Max: "+(Double.MAX_VALUE));

 // System.out.println("Size of Min: "+(String.MIN_VALUE)+" Size of Max: "+(String.MAX_VALUE));
 /*When we ask String Size it will show error like this:Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        MIN_VALUE cannot be resolved or is not a field
        MAX_VALUE cannot be resolved or is not a field

        at Day1.Datatypes.main(Datatypes.java:15)
PS C:\Users\Dhanush\OneDrive\Desktop\Javaprograms>   */


//Binary start with 'b' or 'B'
int number1 = 0b1010;//valid
//int number2 = 0b2435;//invalid

//Note:UnderScore Not use at beginning and end and it can one or more underscore
int number3 = 123__345__456;

System.out.println(number1);
System.out.println(number3);

/*Error when I am assigning String literal like that below:
String literal is not properly closed by a double-quote 
String text = "Hello!,I am Dhanush
.I am studying Engineering in the domain of Computer Science";*/

String text = "Hello!,I am Dhanush.I am studying Engineering in the domain of Computer Science";
System.out.println(text);

//Float formats P:indicates power
float num = 0x12.2P2F;
System.out.println(num);

char ch = '\141'; //octal notation
char ch1 = '\u0061';//hexadecimal notation
System.out.println(ch+" "+ch1);
}  
}
