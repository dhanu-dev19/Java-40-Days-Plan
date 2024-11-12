package Day28;

//Constructor one string from another.... 
public class MakeString {
  public static void main(String[] args) {
    char[] chars1 = {'J','a','v','a','D','e','v'};
    String s1 = new String(chars1);
    String s2 = new String(s1);//referance object as s1
    
    
    String s3 = new String(chars1,4,3);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);//Starting from 4 position and print 3 characters...

    char[] chars2 = {'ನ','ಮ','ರ','ಕ','ಟ','ಕ'};//Interchage with the Unicode
    String s4 = new String(chars2);
    System.out.println(s4);


  }
}
