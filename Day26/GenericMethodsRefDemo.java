package Day26;

interface MyFunc<T>
{
  int func(T[] vals,T v);
}

class MyArrayOps3
{
  static <T> int countMatching(T[] vals,T v){
    int count = 0;

    for(int i=0;i<vals.length;i++)
       if(vals[i] == v)
       count++;

       return count;
  }
}
public class GenericMethodsRefDemo {

  static <T> int myOp(MyFunc<T> f,T[] vals, T v)
  {
    return f.func(vals, v);
  }
  public static void main(String[] args) {
    Integer[] vals = {1,2,3,4,2,3,4,4,5};
    String[] strs = {"One","Two","Three","Two"};
    int count;

    count = myOp(MyArrayOps3::countMatching, vals, 4);
    System.out.println("vals contains "+count+" 4s");

    count = myOp(MyArrayOps3::countMatching, strs, "Two");
    System.out.println("strs contains "+count+" Two's");
  }
}

/*interface MyFunc<T>
{
  int func(T[] vals, T v);
}

class MyArrayOps3
{
  static <T> int countMatching(T[] vals, T v) {
    int count = 0;

    for (int i = 0; i < vals.length; i++)
      if (vals[i].equals(v))   // Use equals instead of ==
        count++;

    return count;
  }
}

public class GenericMethodsRefDemo {

  static <T> int myOp(MyFunc<T> f, T[] vals, T v) 
  {
    return f.func(vals, v);
  }

  public static void main(String[] args) 
  {
    Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
    String[] strs = {"One", "Two", "Three", "Two"};
    int count;
//Type argument would be automatically inferred
    count = myOp(MyArrayOps3::<Integer>countMatching,  vals, 4);
    System.out.println("vals contains " + count + " 4s");

    count = myOp(MyArrayOps3::<String>countMatching, strs, "Two");
    System.out.println("strs contains " + count + " Two's");
  }
}*/

