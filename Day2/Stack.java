package Day2;

class StackDemo{

  int[] stack = new int[10];
  int Size = 10;
  int top;

  public StackDemo()
  {
    top = -1;
  }

  void push(int item)
  {
    if(top==Size-1)
    {
      System.out.println("Stack overflow");
    }
    else
    {
      stack[++top] = item;
    }
  }
  int pop()
  {

    if(top==-1)
    {
      System.out.println("Stack underflow");
      return 0;
    }
    else
      return stack[top--];
    
  }

}

public class Stack 
{
  public static void main(String[] args) 
  {
    
  StackDemo stack1 = new StackDemo();
  StackDemo stack2 = new StackDemo();
   int index;

  //Push the elements
  for(index = 0; index < 10; index++)
  {
    stack1.push(index);
  }

  for(index = 10; index < 20; index++)
  {
    stack2.push(index);
  }
  //Pop the elements:
  System.out.println("poped elements are:");
  for(index = 0; index < 10; index++)
  {
    System.out.println(stack1.pop());
  }
  System.out.println("poped elements are:");
  for(index = 0; index < 10; index++)
  {
  System.out.println(stack2.pop());    
  }

  }
  
}
