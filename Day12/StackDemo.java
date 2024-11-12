package Day12;

interface IntStack
{
  void push(int item);
  int pop();
}
class FixedStack implements IntStack
{
  private int[] stack;
  private int top;
  FixedStack(int Size)
  {
      stack = new int[Size];
      top = -1;
  }
  public void push(int item)
  {
     if(top == stack.length-1){
      System.out.println("Stack OverFlow");
     }
     stack[++top] = item;
  }

  public int pop(){
    if(top == -1){
      System.out.println("Stack underflow");
    }
    return stack[top--];
   }
}
public class StackDemo {
  public static void main(String[] args) {
    FixedStack mystack1 = new FixedStack(5);
    FixedStack mystack2 = new FixedStack(8);
    
    //Push element to the Stack
    for(int i=0;i<5;i++)
    mystack1.push(i);
    for(int i=0;i<8;i++)
    mystack2.push(i);

  //Pop item from the Stack
    for(int i=0;i<5;i++)
       System.out.println(mystack1.pop());
    for(int i=0;i<8;i++)
       System.out.println(mystack2.pop());   
  }
}
