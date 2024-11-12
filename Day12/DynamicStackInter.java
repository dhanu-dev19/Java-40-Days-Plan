package Day12;
interface IntStack1
{
  void push(int item);
  int pop();
}
class DynStack implements IntStack1
{
  private int[] stack;
  private int top;
  DynStack(int Size)
  {
      stack = new int[Size];
      top = -1;
  }
  public void push(int item)
  {    //Dynamic Approach Size is assigned at run time
     if(top == stack.length-1){
      int[] temp = new int[stack.length*2];
      for(int i =0 ;i<stack.length; i++)
            temp[i] = stack[i];
            stack = temp;
            stack[++top] = item;

     }
     stack[++top] = item;
    }

  public int pop(){
    if(top == -1){
      System.out.println("Stack underflow");
      return 0;
    }
    return stack[top--];
   }
}
public class DynamicStackInter {
  public static void main(String[] args) {
    DynStack dynstack1 = new DynStack(5);
    DynStack dynstack2 = new DynStack(8);

    for(int i=0;i<12;i++)
         dynstack1.push(i);

    for(int i=0;i<8;i++)
      System.out.println(dynstack1.pop());
           
  }
}
