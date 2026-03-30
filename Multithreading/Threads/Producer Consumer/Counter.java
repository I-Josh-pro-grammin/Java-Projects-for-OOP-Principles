public class Counter {
    int count;
    boolean valueSet = false;

    public synchronized void put(int count) {
        while(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put :" + count );
        this.count = count;
        this.valueSet = true;
        notify();
    }

    public synchronized void get() {
        while(!valueSet) {
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Get :" + count);
        this.valueSet = false;
        notify();
    }
}

public class Collectn {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);

        for(Object val:list) {
            int n = (Integer) val;
            System.out.println(" " + n);
        }
    }
}