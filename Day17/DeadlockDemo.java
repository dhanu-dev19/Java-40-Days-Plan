package Day17;
class A{
  synchronized void foo(B b){
    String name = Thread.currentThread().getName();

    System.out.println(name+"Entered A.foo");
    
    try{
      Thread.sleep(1000);
    }catch(Exception e){
      System.out.println("A interrupted");
    }
    System.out.println(name+" trying to call B.last()");
    b.last();
  }

  synchronized void last(){
    System.out.println("Inside A.last");
  }
}

class B {
  synchronized void bar(A a){
    String name = Thread.currentThread().getName();

    System.out.println(name+"Entered A.foo");
    
    try{
      Thread.sleep(1000);
    }catch(Exception e){
      System.out.println("B interrupted");
    }
   System.out.println(name+" trying to call A.last()");
    a.last();
  }

  synchronized void last(){
    System.out.println("Inside B.last");
  }
}
public class DeadlockDemo implements Runnable {
    A a = new A();
    B b = new B();
    Thread t;

    DeadlockDemo()
    {
      Thread.currentThread().setName("MainThread");
      t = new Thread(this, "RacingThread");
    }

    void deadlockStart(){
      t.start();
      a.foo(b);
      System.out.println("Back in main thread");
    }

    public void run(){
      b.bar(a);
      System.out.println("Back in other thread");
    }
  public static void main(String[] args) {
    DeadlockDemo d1 = new DeadlockDemo();

    d1.deadlockStart();

  }
}
