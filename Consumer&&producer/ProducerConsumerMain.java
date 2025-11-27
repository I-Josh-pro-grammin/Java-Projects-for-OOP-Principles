public class ProducerConsumerMain {
  public static void main (String[] args) {
    ProducerConsumer pc = new ProducerConsumer(10);

    Thread t1 = new Thread(() -> {
      for(int i=0; i<=50; i++) {
        try {
          pc.produce(i);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
  
    Thread t2 = new Thread(() -> {
      for(int i=0; i<=50; i++) {
        try {
          pc.consume();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
  
    t1.start();
    t2.start();
  }
}
