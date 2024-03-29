package StreamAPI;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(System.out::println);
        int[] arr = IntStream.range(1, 10)
                .toArray();
        int sum = IntStream.range(1, 10)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Random random = new Random();
        int[] randArr = IntStream.generate(() -> random.nextInt(100))
                .limit(10)//промеж
                .toArray();
        System.out.println(Arrays.toString(randArr));
/*  int generate(){
        Random random = new Random();
        return  random.nextInt(100);
     }  */
        String sArr = Arrays.stream(randArr)
                .sorted()//промеж
                .mapToObj(String::valueOf)//промеж
                .collect(Collectors.joining(","));//терм
        System.out.println(sArr);

        String sArr2 = Arrays.stream(randArr)
                .filter(i -> i % 2 == 0)//промеж
                .mapToObj(String::valueOf)//промеж
                .collect(Collectors.joining(","));//терминальная

        System.out.println(sArr2);

        IntStream.range(1, 1001)
                .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 11 == 0)
                .forEach(System.out::println);

        //Bывести квадраты первых n натуральных чисел
        IntStream.range(1, 11)
                .map(i -> i * i)
                .forEach(System.out::println);
        //Вывести степени числа 2
        IntStream.range(1, 11)
                .map(i -> (int) Math.pow(2, i))
                .forEach(System.out::println);
        IntStream.iterate(2, i -> i * 2)
                .limit(10)
                .forEach(System.out::println);

        //Первое число, сумма которого равна 20
        Stream.iterate(new int[]{1, 1}, x -> new int[]{++x[0], x[1] = sum(Integer.toString(x[0]).chars().toArray())})
                .filter(x -> x[1] == 20)
                .limit(1)
                .forEach(x -> System.out.println(x[0]));
    }
        public static int sum(int[] arr) {
            int result = 0;
            for (int a : arr) result += a - '0';
            return result;
        }

    }


