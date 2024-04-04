package classwork0404;

import java.util.ArrayList;

/* Находим  последнюю  цифру  выражения  a^b,  где  a  и  b  -  целые  числа. Результат  может  быть
очень  большим. Для  каждого  числа  от  0  до  9  вычислите  все  возможные  последние  цифры  при  возведении
их  в  заданную  степень. Записать  их  в  коллекцию  ArrayList<ArrayList<Integer>>. Найти  соответствие  при
 получении  последних  цифр.*/
public class Classwork_0404 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            result.add(new ArrayList<>());
            for (int j = 1; j < 10; j++) {
                int digit = (int) Math.pow(i, j) % 10;
                if (!result.get(i).contains(digit))
                    result.get(i).add(digit);
            }
            System.out.println(result.get(i));
        }
        int a = 2;
        int b = 2;
        int lastA = a % 10;
        int lastB = b % 4 == 0 ? result.get(lastA).size() - 1 : b % result.get(lastA).size() - 1;
        int last = result.get(lastA).get(lastB);
//System.out.println(Math.pow(a,b%4));
        System.out.println(last);
    }
}

