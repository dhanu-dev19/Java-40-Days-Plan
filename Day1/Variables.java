package Day1;

public class Variables {
  public static void main(String[] args) {
    
    //1.Compound intialization
    int length = 10,breadth = 40,height = 30;
    System.out.println("Result:"+(length+breadth+height));

    //2.Dynamic Intialization
    int value = (length*breadth*height);
    System.out.println(value);

    //3.Scope of variable
    int x = 10;
  { 
    //It will help to protect the Data and unauthorized to access
      int y = 20;
      System.out.println(y);
    }
    System.out.println(x);
    /*System.out.println(y);   Error Like that because it will destroy after comes from block scope:
    Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    y cannot be resolved to a variable*/
    
//4.
    int bar = 1;
    {
    //  int bar = 2; Complie Error: bar already defined
      }
      System.out.println(bar);
  }
}
