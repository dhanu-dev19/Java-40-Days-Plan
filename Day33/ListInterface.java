package Day33;

import java.util.*;


public class ListInterface {

  public static void listInter(){
    List<Integer>list = new ArrayList<>();//It allows duplicate
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(10);
    System.out.println(list.get(0));
    System.out.println(list.remove(3));
    System.out.println(list);
  }

  public static void setInter(){
    Set<String>set = new HashSet<>();
    set.add("Dhanush");
    set.add("Darshan");
    set.add("Deemanth");
    set.add("Kushal");
    set.add("Likith");
    set.add("Dhanush");
    System.out.println(set);
    System.out.println(set.size());
  }

  public static void QueueInter(){
    Queue<String> queue = new LinkedList<>();
    queue.add("A");
    queue.add("B");
    queue.add("C");
    System.out.println(queue.poll());
    System.out.println(queue.peek());
    System.out.println(queue.offer("A"));
    System.out.println(queue.remove());
  }

  public static void DequeInter(){
    Deque<String> deque = new ArrayDeque<>();
    deque.addFirst("First");
    deque.addFirst("Second");
    deque.addLast("Last");
    deque.offer("darshan");
    System.out.println(deque);
    System.out.println(deque.peekLast());
    System.out.println(deque.pollLast());//Remove last element
    System.out.println(deque);
  }

  public static void main(String[] args) {
    listInter();//Type-1
    setInter();//Type-2
    QueueInter();//Type-3
    DequeInter();//Type-4



  }
}
