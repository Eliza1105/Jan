package lambda;

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("2");
        list.add("1");
        list=sort(list);
        System.out.println(Arrays.toString(list.toArray()));

         */
        List<String> list  = new ArrayList<>(List.of("2","1"));
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
    //Отсортировать список строк с помощью лямбда-выражения?
    public static List<String> sort(List<String> list) {
        list.sort(String::compareTo);
        return list;
    }
}
