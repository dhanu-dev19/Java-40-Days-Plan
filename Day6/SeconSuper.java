package Day6;
class SuperDemo1{
  int i;
}
class SuperDemo2 extends SuperDemo1{
  int i;//this i hides the i in SuperDemo1
  SuperDemo2(int a,int b)
  {
    super.i = a; //i in SuperDemo1
    i = b;//i in SuperDemo2
  }
  void print(){
    System.out.println("i in superclass:"+super.i);//It will acces superclass value
    System.out.println("i in subclass:"+i);
  }
}
public class SeconSuper {
  public static void main(String[] args) {
    SuperDemo2 SubObj = new SuperDemo2(10, 30);
    SubObj.print();
  }
}
