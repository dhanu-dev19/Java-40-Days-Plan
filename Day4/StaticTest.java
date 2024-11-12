package Day4;
class StaticDemo{
static int a = 10;
static int b = 20;

static void SumNum(){
  System.out.println("sum of Numbers:"+(a+b));
}

}

public class StaticTest {
public static void main(String[] args) {
  //Note:using classnmae we can access data thorugh static keyword.
  System.out.println("B value:"+StaticDemo.a);
  System.out.println("A value:"+StaticDemo.a);
  StaticDemo.SumNum();

}  
}
