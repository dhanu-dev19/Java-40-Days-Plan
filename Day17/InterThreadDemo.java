package Day17;

class Q1{
  int n;
  boolean valueSet=false;

  synchronized int get(){
    while(!valueSet)
      try{
        wait();
      }catch(InterruptedException e){
        System.out.println("Interrupted exception");
      }
      
      System.out.println("Got:"+n);
      valueSet = false;
      notify();
      return n;
    
  }

  synchronized void put(int n){
    while (valueSet) {
      try{
        wait();
      }catch(InterruptedException e){
        System.out.println("Interrupted Exception Caught");
      }
    }
    this.n = n;
    valueSet = true;
    System.out.println("put:"+n);
    notify();
  }
}
class Producer1 implements Runnable{
  Q1 q;
  Thread t;
  
  public Producer1(Q1 q){
    this.q = q;
    t = new Thread(this,"Producer");
  }

  public void run(){
    int i=0;
    while (true) {
      q.put(i++);
    }
  }
}
class Consumer1 implements Runnable{
  Q1 q;
  Thread t;
  Consumer1(Q1 q){
    this.q = q;
    t = new Thread(this,"Consumer");
  }
  public void run(){
    while(true){
      q.get();
    }
  }
}
public class InterThreadDemo {
  public static void main(String[] args) {
    Q1 q = new Q1();
    Producer1 p = new Producer1(q);
    Consumer1 c = new Consumer1(q);

    p.t.start();
    c.t.start();

    System.out.println("Press Control-C to Stop.");
  }
}
