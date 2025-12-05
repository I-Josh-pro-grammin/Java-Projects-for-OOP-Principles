package ExcecutorFramework;

public class Task implements Runnable {
  int num;

  public Task(int num){
     this.num = num;
  }

  @Override
  public void run() {
    System.out.println("Task " + num + "has started");

    for(int i=num; i<num+10; i++) {
      System.out.print(i);
    }

    System.out.println("Task  " + num + "has completed");
  }

}

