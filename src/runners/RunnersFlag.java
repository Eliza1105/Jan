package runners;

public class RunnersFlag {
    public static void main(String[] args) throws InterruptedException {
        //
        Runner runner1 = new Runner(1);
        Runner runner2 = new Runner(2);
        //
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        //
        thread1.start();
        thread2.start();

        Thread.sleep(300);
        runner1.setFlag(true);
        runner2.setFlag(true);
    }


    static class Runner implements Runnable {
        private int index;
        private boolean flag = false;

        public void setFlag(boolean flag) {
            this.flag = flag;
        }


        public Runner(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            int i = 0;
            while (!flag) {
                System.out.println("Runner " + index + " is running, step " + i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
