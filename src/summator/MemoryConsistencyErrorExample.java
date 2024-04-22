package summator;

public class MemoryConsistencyErrorExample {
    //Значение переменной, считанной потоком thread, не обновляется
    //private static boolean sayHello = false;
    private static volatile boolean sayHello = false; //Результат операции записи значения в volatile переменную одним потоком, становится виден всем другим потокам, которые используют эту переменную для чтения из нее значения.

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while(!sayHello) {}
            System.out.println("Hello World!");
            while(sayHello) {}
            System.out.println("Good Bye!");
        });

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Say Hello..");
        sayHello = true;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Say Bye..");
        sayHello = false;
    }
}
