package Day22;

class Stats<T extends Number>{
  T[] nums; //array of Number or subclass
  Stats(T[] o){
    nums = o;
  }

  double average(){
    double sum = 0.0;

    for(int i=0;i<nums.length;i++){
        sum += nums[i].doubleValue();
        
    }
    return sum/nums.length;
  }

  //Dwetermine if two averages are the same
  //Notice the use of wildcard
 public boolean isSameAvg(Stats<?> ob)
 {
  if(average() == ob.average())
    return true;
  return false;  
   }


}

public class WildCardDemo {
  public static void main(String[] args) {
    Integer[] inums = {1,2,3,4,5};
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v = iob.average();
    System.out.println("iob average:"+v);

    Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
    Stats<Double> dob = new Stats<Double>(dnums);
    double w = dob.average();
    System.out.println("dob average:"+w);

    System.out.print("Avereage of iob and dob:");
    //boolean x = iob.isSameAvg(dob);
    //System.out.println(x);
    if(dob.isSameAvg(iob)) //Not Handled:Exception raised by java lang "Undefined Method invocation"
    //It's a logical error correct it later.....
    {
      System.out.println("Are the same");
    }
    else
    {
      System.out.println("differ");
    }
  }
}
