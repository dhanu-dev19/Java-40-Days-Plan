package Day16;
//Creating multiple threads
class NewThread2 implements Runnable{
  String name; //To define multiple names to the threads.
  Thread t ;
   NewThread2(String Threadname){
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
public class AliveThreadDemo  {
  public static void main(String[] args) {
    NewThread2 nt1 = new NewThread2("one");
    NewThread2 nt2 = new NewThread2("Two");
    NewThread2 nt3 = new NewThread2("Three");

    nt1.t.start();
    nt2.t.start();
    nt3.t.start();

    System.out.println("Thread one is Alive:"+nt1.t.isAlive());
    System.out.println("Thread two is Alive:"+nt2.t.isAlive());
    System.out.println("Thread three is Alive:"+nt3.t.isAlive());


    try{
      for(int i=5;i>0;i--){
        System.out.println("Main thread:"+i);
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){
      System.out.println("Main thread Interrupted");
    }
    
    System.out.println("Thread one is Alive:"+nt1.t.isAlive());
    System.out.println("Thread two is Alive:"+nt2.t.isAlive());
    System.out.println("Thread three is Alive:"+nt3.t.isAlive());

    System.out.println("Main thread exiting");
  }
  
}

