package Day17;
class Q{
  int n;

  synchronized int get(){
    System.out.println("Got:"+n);
    return n;
  }

  synchronized void put(int n){
    this.n = n;
    System.out.println("put:"+n);
  }
}
class Producer implements Runnable{
  Q q;
  Thread t;
  
  public Producer(Q q){
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
class Consumer implements Runnable{
  Q q;
  Thread t;
  Consumer(Q q){
    this.q = q;
    t = new Thread(this,"Consumer");
  }
  public void run(){
    while(true){
      q.get();
    }
  }
}
public class InterThreadCommunication {
  public static void main(String[] args) {
    Q q = new Q();
    Producer p = new Producer(q);
    Consumer c = new Consumer(q);

    p.t.start();
    c.t.start();

    System.out.println("Press Control-C to Stop.");
  }
}
