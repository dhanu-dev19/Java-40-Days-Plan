package Day2;

class ObjectParameterDemo{
  //Objects as parameter to method
  int a,b;

  ObjectParameterDemo(int i,int j)
  {
    this.a = i;
    this.b = j;
  }

  boolean Equalto(ObjectParameterDemo object)
  {
    if(object.a == a && object.b == b){
      return true;
    }
    return false;
  }

}
public class ObjectParameter {
  public static void main(String[] args) {
    ObjectParameterDemo ob = new ObjectParameterDemo(10, 20);
    System.out.println("Both are equal!,:"+ob.Equalto(ob));
  }
}
