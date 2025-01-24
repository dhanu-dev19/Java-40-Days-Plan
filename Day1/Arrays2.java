package Day1;

public class Arrays2 {
  public static void main(String[] args) 
  {
    int[][][] Arrays = new int[3][4][5]; //Multi Dimenstional Array Declaration
     int index,secondIndex,thirdIndex;

     //Initializing the Array
    for(index = 0;index < 3;index++)
    {
      for(secondIndex = 0;secondIndex < 4;secondIndex++)
      {
        for(thirdIndex = 0;thirdIndex < 5;thirdIndex++)
        {
          Arrays[index][secondIndex][thirdIndex] = index * secondIndex * thirdIndex; //Output: index = 0,1,2 secondIndex = 0,1,2,3 thirdIndex = 0,1,2,3,4
        }
      }
    }
    
    //Printing the Array
     for(index = 0; index < 3; index++)
     {
      for(secondIndex = 0; secondIndex < 4; secondIndex++)
      {
        for(thirdIndex = 0; thirdIndex < 5; thirdIndex++)
        {
          System.out.print(Arrays[index][secondIndex][thirdIndex]+" ");
        }
          System.out.println();
        }
        System.out.println();
    }
  }
}
