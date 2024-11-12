package Day17;

class Callme1{

  void call(String msg){
    System.out.print("["+msg);
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
      System.out.println("Interrupted");
    }
    System.out.println("]");
  }
}
class Caller1 implements Runnable{
  String msg;
  Callme1 target;
  Thread t;
  public Caller1(Callme1 targ, String s){
    msg = s;
    target = targ;
    t= new Thread(this);
  }
  public void run(){
    synchronized(target){
      target.call(msg);   //Synchronized block
    }
  }
}
public class SyncDemoWithSync {
  public static void main(String[] args) {
    Callme1 target = new Callme1();
    Caller1 ob1 = new Caller1(target, "Hello");
    Caller1 ob2 = new Caller1(target, "Syncronized");
    Caller1 ob3 = new Caller1(target, "World");

    //Starts the threads.
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();

    //Wait for the threads to end

    try{
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    }catch(InterruptedException e){
      System.out.println("Interrupted");
    }
  }
}

