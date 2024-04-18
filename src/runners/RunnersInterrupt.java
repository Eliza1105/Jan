package runners;

public class RunnersInterrupt {
    public static void main(String[] args) throws InterruptedException {
    //
    RunnersFlag.Runner runner1 = new RunnersFlag.Runner(1);
    RunnersFlag.Runner runner2 = new RunnersFlag.Runner(2);
    //
    Thread thread1 = new Thread(runner1);
    Thread thread2 = new Thread(runner2);
    //
    thread1.start();
    thread2.start();

    Thread.sleep(300);
    thread1.interrupt();
        thread2.interrupt();
}


    static class Runner implements Runnable {
        private int index;

        public Runner(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                System.out.println("Runner " + index + " is running, step " + i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Runner "+index+" finished");
                    return;
                }
            }
        }
    }
}
