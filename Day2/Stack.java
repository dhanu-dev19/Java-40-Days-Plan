package Day2;

class StackDemo{

  int[] stack = new int[10];
  int Size = 10;
  int top;

  public StackDemo(){
    top = -1;
  }
  void push(int item){
    if(top==Size-1){
      System.out.println("Stack overflow");
    }
    else{
      stack[++top] = item;
    }
  }
  int pop(){

    if(top==-1){
      System.out.println("Stack underflow");
      return 0;
    }
    else
      return stack[top--];
    
  }

}

public class Stack {
  public static void main(String[] args) {
    
  StackDemo stack1 = new StackDemo();
  StackDemo stack2 = new StackDemo();
   int i;

  //Push the elements
  for(i=0;i<10;i++){
    stack1.push(i);
  }

  for(i=10;i<20;i++){
    stack2.push(i);
  }
  //Pop the elements:
  System.out.println("poped elements are:");
  for(i=0;i<10;i++){
    System.out.println(stack1.pop());
  }
  System.out.println("poped elements are:");
  for(i=0;i<10;i++){
  System.out.println(stack2.pop());    
  }

  }
  
}
