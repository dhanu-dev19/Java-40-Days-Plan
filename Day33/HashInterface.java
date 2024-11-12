package Day33;

import java.util.*;

public class HashInterface {


  public static void MapInterface(){
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Darshan");
    map.put(2, "Dhanush");
    map.put(4, "Deeamnth");
    System.out.println(map.get(1));
    System.out.println(map);
  } 

  public static void sortedMap(){
    SortedMap<Integer, String> sortedmap = new TreeMap<>();
    sortedmap.put(10, "Ten");
    sortedmap.put(1, "One");
    sortedmap.put(2, "Two");  //As name suggest sorted order
    sortedmap.put(4, "Four");
    System.out.println(sortedmap.remove(2));
    System.out.println(sortedmap);
  }

  public static void Navigablemap(){
    NavigableMap<Integer, String> navigable = new TreeMap<>();
    navigable.put(1, "A");
    navigable.put(3, "C");
    navigable.put(2, "B");
    navigable.put(4, "C");
    navigable.put(5, "B");
    System.out.println(navigable);

  }
  public static void main(String[] args) {
    MapInterface();
    sortedMap();
    Navigablemap();

  }
}
