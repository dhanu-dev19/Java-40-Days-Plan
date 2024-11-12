package Day34;

import java.util.*;
public class CollectionClass 
{  
  public static void ListClass(){
    List<String>a1 = new ArrayList<>();

    System.out.println("Initial size of al: "+a1.size());

    //Add elements to the array list
    a1.add("B");
    a1.add(1,"C");
    a1.add("D");
    a1.add("X");
    a1.addLast("Z");
    System.out.println("Size of a1 after additions: "+a1.size());

    //Display the array list.
    System.out.println("Contents of a1: "+a1);

    a1.remove("Y");
    a1.remove(3);
    a1.removeLast();

    System.out.println(a1);
    System.out.println(a1.reversed());
    
  }
  public static void main(String[] args) 
  {
    ListClass();
  }
}
