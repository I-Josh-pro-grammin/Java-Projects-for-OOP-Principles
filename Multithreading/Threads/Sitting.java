public class Sitting {
    public static void main(String[] args) {

        Thread thr1 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                System.out.println("Boy");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thr2 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                System.out.println("Girl");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thr1.start();
        thr2.start();
        try {
            thr1.join();
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}

}