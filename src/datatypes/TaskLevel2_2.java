package datatypes;

import java.util.Arrays;
import java.util.Random;

public class TaskLevel2_2 {
    public static void main(String[] args) {
        int [] arr = new int[9];
        for (int i=0; i< arr.length; i++)
            arr[i]= i+1;
        System.out.println(Arrays.toString(arr));
        Random random= new Random();
        for (int i=0; i< arr.length; i++)
            swap(arr, random.nextInt(arr.length),random.nextInt(arr.length));
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
