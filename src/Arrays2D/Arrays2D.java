package Arrays2D;

import java.util.Arrays;

public class Arrays2D {
    static int[][] arr;
    static int rows = 6;
    static int cols = 5;

    public static void main(String[] args) {
        arr = new int[rows][cols];
        fillOrder();
        //fillOrderUD();
        //fillSnake();
        travelSES();
        print();
        //System.out.println(Arrays.deepToString(arr));
    }

    static void print() {
        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    static void fillOrder() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = j + 1 + i * cols;
    }

    static void fillOrderUD() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = i + 1 + j * rows;
    }

    static void fillSnake() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (i % 2 == 0)
                    arr[i][j] = j + 1 + i * cols;
                else
                    arr[i][j] = cols - j + i * cols;
    }

    static void travelSES() {
        int i = 0;
        int j = 0;
        System.out.println(arr[i][j] + " ");
        while (i <= arr.length || j <= arr[i].length) {
            i++;
            j++;
            if (i < arr.length && j < arr[i].length)
                System.out.println(arr[i][j]);
            else break;
            i++;
            if (i < arr.length && j < arr[i].length)
                System.out.println(arr[i][j]);
            else break;
        }
    }

   // static void travelSNE() {
        int i = 0;
        int j = 0;
        //System.out.print(arr[i][j] + " ");
       /* while (i <= arr.length || j <= arr[i].) {
            i++;

            if (i < arr.length && j < arr[i].length)
                System.out.println(arr[i][j]);
            else break;
            i++;
            j++;
            if (i < arr.length && j < arr[i].length)
                System.out.println(arr[i][j]);
            else break;

        */
        }

