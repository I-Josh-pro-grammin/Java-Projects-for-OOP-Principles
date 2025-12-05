package ExcecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExcecutorFramework {
    public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    executorService.execute(new Task(1));
    executorService.execute(new Task(2));
    executorService.execute(new Task(3));
    executorService.shutdown();
  }
}
