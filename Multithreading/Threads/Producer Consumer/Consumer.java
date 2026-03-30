public class Consumer implements Runnable{
    Counter count;
    public Consumer(Counter count) {
        this.count = count;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while(true) {
            count.get();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}