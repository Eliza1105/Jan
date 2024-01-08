package datatypes;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 4, 2,5, 1};
        int max = arr[0];
        for (int elem : arr)
            if (max > elem) max = elem;
        //System.out.println(max);
        //является ли 1 точка лок минимумом
        if (arr[0] < arr[1] && arr[0] > max)
            max = arr[0];
        //является ли последняя точка лок минимумом
        int n = arr.length;
        if (arr[n - 1] < arr[n - 2] && arr[n - 1] > max)
            max = arr[n - 1];
        //проверка остальных локальных минимумов
        for (int i=1; i<n-2; i++)
            if (arr[i]<arr[i-1] && arr[i]<arr[i+1] && arr[i]>max)
                max = arr[i];
        System.out.println(max);
    }
}
