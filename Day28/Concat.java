package Day28;

public class Concat {
  public static void main(String[] args) {
  int age = 9;
  String s = "He is "+age+" years old.";
  System.out.println(s);

  String s1 = "four:"+2+2;//It's Conact with the String and behave like a String
  System.out.println(s1);

  String s2 = "four:"+(2+2);//By specifying parathesis helps to differ the string and integer
  System.out.println(s2);


  }
}
