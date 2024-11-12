package Day29;

public class SortString {

  static String[] arr ={
    "Now","is","the","time","for","all","good","men","to","come","to"
  };
  public static void main(String[] args) {
    
    for(int j = 0; j<arr.length;j++)
    {
      for(int i = j+1;i<arr.length;i++)
      {
        if(arr[i].compareTo(arr[j])<0)
        {
          String t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
      System.out.print(arr[j]+" ");  //Without Case sensitive  
    }

System.out.println();
    for(int j = 0; j<arr.length;j++)
    {
      for(int i = j+1;i<arr.length;i++)
      {
        if(arr[i].compareToIgnoreCase(arr[j])<0)
        {
          String t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
      System.out.print(arr[j]+" ");    //With Case sensitive
    }
  }
}
