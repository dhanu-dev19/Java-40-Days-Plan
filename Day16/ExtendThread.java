package Day16;

class Newthread extends Thread{

 Newthread(){
  //create a new, second thread
  super("Demo Thread");
  System.out.println("Child thread:"+this);
 }
 
 //This is entry point for the second thread
 public void run(){
  try{
    for(int i=5;i>0;i--){
      System.out.println("Child Thread:"+i);
      Thread.sleep(500);
    }
  }catch(InterruptedException e){
    System.out.println("Child thread Interrrupted");
  }
  System.out.println("Child thread Exiting");
 }
}
public class ExtendThread {
  public static void main(String[] args) {
    Newthread nt = new Newthread(); //create a new thread

    nt.start();//start the thread

   try{
    for(int i=5;i>0;i--){
      System.out.println("Main thread:"+i);
      Thread.sleep(1000);
    }
   }catch(InterruptedException e){
    System.out.println("Main Thread Interrupted");
   }
   System.out.println("Main thread existing");
  }
  
}
