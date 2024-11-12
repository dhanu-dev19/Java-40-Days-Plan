package Day34;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArrayListToArray {


  public static void main(String[] args) {
    
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(3);
    a1.add(2);
    a1.add(1);

    System.out.println("----------------------------ArrayList----------------------------------------");

    System.out.print("Contents are: "+ a1);

    Integer[] ia = new Integer[a1.size()];
    ia = a1.toArray(ia);

    int sum = 0;

    for(int i:ia)
       sum += i;

       System.out.println("\nSum is:"+sum);


    System.out.println("----------------------------Linked List-----------------------------------------");
     LinkedList<String> l1 = new LinkedList<>();
     l1.add("Apple");
     l1.add("Orange");
     l1.add("Mongo");
     l1.add("Apple");
     l1.addFirst("Orange");
     l1.addLast("Mongo");

     l1.add(1,"gava");
     
     System.out.println(l1);

    System.out.println( 
     l1.remove("Mongo")+" "+
     l1.remove()+" "+
     l1.remove(3)+" "+
     l1.removeFirstOccurrence("Apple")+" "+
     l1.removeLastOccurrence("Orange")
     );
     System.out.println(l1);
    
     System.out.println("-------------------------------HashSet---------------------------------------------");
     HashSet<String> hs = new HashSet<>();
     hs.add("Alpha");
     hs.add("Beta");
     hs.add("Gamma");
     hs.add("Epsilon");
     hs.add("Omega");  //Don't Allow Duplicates
     hs.add("Alpha");
     System.out.println(hs);

     System.out.println("----------------------------LinkedHashSetClass--------------------------");
     LinkedHashSet<Integer> Lh =  new LinkedHashSet<>();
     Lh.add(2);
     Lh.add(1);
     Lh.add(5);
     Lh.add(5);//Don't allow Duplicates..........
     System.out.println(Lh);


     System.out.println("------------------TreeSet Class---------------------");
     TreeSet<String> ts = new TreeSet<>();
     
     ts.add("Darshan");
     ts.add("Deemanth");
     ts.add("Kushal");
     ts.add("Likith");
     ts.add("Akash");
     ts.add("Kushal");     /*Dont allow Duplicates and it must be unique with Sorted Ordered Tree set */
     System.out.println(ts);  
     System.out.println(ts.contains("Likith"));
     System.out.println(ts.getFirst());
     System.out.println(ts.getClass());
     System.out.println(ts.toArray());

     for(String ch:ts){
      System.out.println(ch);
     }

     System.out.println("---------------------PriorityQueue Class---------------------");
     PriorityQueue<String> pq = new PriorityQueue<>();
     pq.offer("adarsha");
     pq.offer("Hemanth");
     pq.offer("Ranjan");
     pq.offer("Salman");  //Ascending Order
     pq.offer("harshan");
     pq.offer("Manu");

     System.out.println(pq);
     System.out.println(pq.peek());
     System.out.println(pq.poll());
     System.out.println(pq.poll());
     System.out.println(pq);

     System.out.println("---------------------------ArrayDeque----------------------------------");
     ArrayDeque<String> adq = new ArrayDeque<>();

     adq.push("A");
     adq.push("B");
     adq.push("D");
     adq.push("E"); //Logic:Last in first Out
     adq.push("F");

     System.out.println("Popping the stack");

     while(adq.peek() != null){
      System.out.print(adq.pop()+" ");
     }
     System.out.println();
   }
}
