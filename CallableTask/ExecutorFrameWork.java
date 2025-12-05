package CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameWork {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
      ExecutorService executor = Executors.newFixedThreadPool(2);
      List<CollableTask> tasks = List.of(new CollableTask(2), new CollableTask(3), new CollableTask(5));

      List<Future<Integer>> vals = executor.invokeAll(tasks);
      // Future<Integer> future1 = executor.submit(new task(4));
      // Future<Integer> future2 = executor.submit(new task(5));
      // Future<Integer> future3 = executor.submit(new task(6));

      // System.out.println(future1.get());
      // System.out.println(future2.get());
      // System.out.println(future3.get());

      for(Future<Integer> val : vals){
          System.out.println(val.get());
      }

      executor.shutdown();
  }
}