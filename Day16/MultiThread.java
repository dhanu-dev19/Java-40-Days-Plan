package Day16;

//Creating multiple threads
class NewThread1 implements Runnable{
  String name; //To define multiple names to the threads.
  Thread t ;
   NewThread1(String Threadname){
    name = Threadname;
    t = new Thread(this,name);
    System.out.println("New thread:"+t);
   }

   //This is the startinf point of the thread
   public void run(){
    try{
      for(int i=5;i>0;i--){
        System.out.println("Child thread:"+i);
        Thread.sleep(500);
      }
    }catch(InterruptedException e){
      System.out.println("Child thread interrupted.");
    }
    System.out.println("Child thread Exiting");
    
   }
}
public class MultiThread {
  public static void main(String[] args) {
    NewThread1 nt1 = new NewThread1("one");
    NewThread1 nt2 = new NewThread1("Two");
    NewThread1 nt3 = new NewThread1("Three");

    nt1.t.start();
    nt2.t.start();
    nt3.t.start();

    try{
      for(int i=5;i>0;i--){
        System.out.println("Main thread:"+i);
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){
      System.out.println("Main thread Interrupted");
    }
    System.out.println("Main thread exiting");
  }
  
}
