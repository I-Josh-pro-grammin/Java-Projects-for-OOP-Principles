public class Producer implements Runnable{
    Counter count;
    public  Producer(Counter count) {
        this.count = count;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i =0;
        while(true) {
            count.put(i++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}