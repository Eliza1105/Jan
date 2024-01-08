import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    //Переменные-члены класса(поля)
    private static final int SIZE = 5;
    static int[] arr = new int[SIZE];

    //методы
    public static void main(String[] args) {
        //demo();
        fillOrder();
        //fillReverse();
        //fillRandom();
        print();
        //System.out.println(sum());
        //System.out.println(min(true));
    //swap(0,4);
        reverce();
    print();
    }

    //создание и инициализация
    static void demo() {
        int[] arr0 = {3, 1, 2};
        arr0[0] = 4;
        System.out.println(arr0[2]);
        System.out.println(arr0.length);
        int[] arr1 = new int[4];
    }

    static void fillOrder() {
        for (int i = 0; i < SIZE; i++)
            arr[i] = i + 1;
    }

    static void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void fillReverse() {
        for (int i =0; i < SIZE; i++)
            arr[i] = SIZE - 1;
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++)
            arr[i] = random.nextInt(90) + 10;
    }

    //нахождение суммы
    static int sum() {
        int result = 0; // можно и sum
        for (int i = 0; i < SIZE; i++)
            result += arr[i];
        return result;
    }

    static int min() {
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if (min > arr[i]) min = arr[i];
        return min;
        }
    static int min(boolean b){
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if (min>arr[i]) min=arr[i];
        if(b) System.out.println(min);
        return min;
    }
    static void reverce(){
        for (int i = 0; i < SIZE; i++);
    }
    static void swap(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}