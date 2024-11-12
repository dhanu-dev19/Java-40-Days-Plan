package Day23;

//Doubt on this topic 
//Remind:Exception cannot handle
//Cleared Exception handled
class NonGen
{
  int num;

  NonGen(int i){
    num = i;
  }

  int getnum()
  {
    return num;
  }
}
//Generic subclass
class Gen3<T> extends NonGen
{
  T ob;

  Gen3(T o,int i){
    super(i);
    ob = o;
  }

  //Return ob
  T getOb(){
    return ob;
  }
}
public class HierDemo2 {
  public static void main(String[] args) {
    
    Gen3<String> w = new Gen3<String>("Hello",47);

    System.out.println(w.getOb());
    System.out.println(w.getnum());
  }
}
