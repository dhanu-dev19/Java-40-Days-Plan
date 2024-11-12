package Day28;

public class CharacterExtraction 
{
  public static void main(String[] args) 
  {
    char ch;  //Type 1
    ch = "abc".charAt(1);
    System.out.println(ch);

    //Syntax:void getChars(int sourceStart,int sourceEnd,char[] target,int targetStart);

    String s = "This is a demo of the getChars method";//Type 2
    int start = 10;
    int end = 14;
    char[] buf = new char[end-start];

    s.getChars(start, end, buf, 0);
    System.out.println(buf);

   char[] chars =  s.toCharArray();
    System.out.println(chars);
  }
}
