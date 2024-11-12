package Day21;

public class MaxFinder {
  public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
      T max = a;
      if (b.compareTo(max) > 0) {
          max = b;
      }
      if (c.compareTo(max) > 0) {
          max = c;
      }
      return max;
  }

  public static void main(String[] args) {
      System.out.println("Max of 3, 7, 2: " + findMax(3, 7, 2));
      System.out.println("Max of 3.14, 2.78, 9.99: " + findMax(3.14, 2.78, 9.99));
      System.out.println("Max of apple, pear, orange: " + findMax("apple", "pear", "orange"));
  }
}
