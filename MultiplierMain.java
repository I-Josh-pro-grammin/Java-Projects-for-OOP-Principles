class Counter {
  int count;

  public synchronized void increment() {
    count++;
  } 
  
}

// class Boy implements Runnable {
//   public void run() {
//     for(int i=0; i<20; i++) {
//       System.out.println("Boy");
//       try {
//         Thread.sleep(1);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }


// class Girl implements Runnable {
//   public void run() {
//     for(int i=0; i<20; i++) {
//       System.out.println("Girl");
//     }
//   }
// }

public class MultiplierMain {  
  public static void main(String[] args) {
    // Multiplier mult= (x, y) -> x*y;
    
    // int k = mult.multiply(5,4);
    // System.out.println(k);

    Counter counter = new Counter();    

    Runnable counter1 = ()->{
      for(int i=0; i<500; i++) {
        counter.increment();
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
    };

    Runnable counter2 = ()->{
      for(int i=0; i<500; i++) {
        counter.increment();
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
    };

    Thread t1= new Thread(counter1);

    Thread t2 = new Thread(counter2);


    t1.start();
    t2.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(counter.count);
}
}
