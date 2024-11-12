package Day29;

public class ModifyStringDemo {
  public static void main(String[] args) {
    String org = "This is a test. This is, too.";
    String search = "is";
    String sub = "was";
    int i;
    String result = "";

    do{
      System.out.println(org);
      i = org.indexOf(search);
      if(i != -1){
        result = org.substring(0, i);
        result = result + sub;
        result = result + org.substring(i + search.length());
        org = result;
      }
    }while(i != -1);
  }
}
