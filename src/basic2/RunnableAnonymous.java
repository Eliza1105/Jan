package basic2;

public class RunnableAnonymous {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main: " + Thread.currentThread().getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                    System.out.println("Child: " + Thread.currentThread().getName());
                System.out.println("Child has been finished");
            }
        };
        System.out.println("Creating child thread");
        Thread thread = new Thread(runnable);
        System.out.println("Starting child thread");
        thread.start();

        thread.join();//родительский дожидается выполнения дочернего

        System.out.println("Main has been finished");
    }
}


