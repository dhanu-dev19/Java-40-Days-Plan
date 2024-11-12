package Day19;

public class AutoExpression {
  public static void main(String[] args) {
    Integer iOb,iOb2;
    int i;

    iOb = 100;
    System.out.println("Original value of iOb:"+iOb);

    //The following automatically unboxes iOb
    //Performs the increment, and then reboxes
    //the result back into iOb.
    ++iOb;
    System.out.println("After ++iOb:"+iOb);

    //Evaluated and the result reboxed
    //Assigned to iOb2.
    iOb2 = iOb + (iOb/3);
    System.out.println("iOb2 after expression:"+iOb2);

    //result is not reboxed
    i = iOb+(iOb/3);
    System.out.println("i after expression: "+i);
  }
}
