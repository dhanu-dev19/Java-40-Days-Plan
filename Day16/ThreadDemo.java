package Day16;

class NewThread implements Runnable{
 Thread t;
 NewThread(){
  //Create a new, second thread
  t = new Thread(this, "Demo thread");
  System.out.println("Child thread:"+t); 
 }
 public void run(){
  try{
    for(int i=5;i>0;i--){
      System.out.println("Child Thread"+i);
      Thread.sleep(500);
    }
  }catch(InterruptedException e){
    System.out.println("Child interrupted.");
  }
  System.out.println("Exiting child thread.");
 }
}
public class ThreadDemo {
  public static void main(String[] args) {
    NewThread nt = new NewThread();//Create new thread
    nt.t.start();//start the thread

    try{
      for(int i=5;i>0;i--){
        System.out.println("Main thread:"+i);
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){
      System.out.println("New thread interrupted");
    }
    System.out.println("Main thread existing");
    }
  
}
