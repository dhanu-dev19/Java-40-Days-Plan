package Day21;

public class GenericMethod {
  public static <E> void printArray(E[] array) {
      for (E element : array) {
          System.out.print(element + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      Integer[] intArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
      String[] stringArray = {"Hello", "World", "Generic", "Methods"};

      System.out.println("Integer Array:");
      printArray(intArray);

      System.out.println("Double Array:");
      printArray(doubleArray);

      System.out.println("String Array:");
      printArray(stringArray);
  }
}
