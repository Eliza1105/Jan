package lambda;

public class DefaultDemo implements Example {
    public static void main(String[] args) {
      /*  new Example() {
            @Override
            public int process(int a) {
                return 0;
            }
        }.show();

       */
        //  ((Example) a-> 0).show();

    }

    @Override
    public int process(int a) {
        return 0;
    }
}
    interface Example {
        int process(int a);
        default void show() {
            System.out.println("default show()");
        }
    }

