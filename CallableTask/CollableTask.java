package CallableTask;
import java.util.concurrent.Callable;;

public class CollableTask implements Callable<Integer> {
  
  int value;

  public CollableTask(int value) {
    this.value = value;
  }

  public Integer call() { 
    return value;
  }
}
