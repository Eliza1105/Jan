package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShutTheBox {
        public static void main(String[] args) {
            int size = 10;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < size; i++)
                arr.add(i + 1); //добавили в массив
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int count = 0; //Количество введенных чисел
            int[] numbers; //Введенные числа
            int sum = 0; //Счет
            boolean flag = true;
            do {
                int rand = random.nextInt(10) + 1;
                System.out.printf("Число: %d, массив: %s%n", rand, arr.toString());
                System.out.println("Ваш выбор: ");
                String answer = scanner.nextLine();
                if (answer.isEmpty()) break;
                String[] sNumbers = answer.split(" ");
                count = sNumbers.length;
                numbers = new int[count];
                for (int i = 0; i < count; i++)
                    numbers[i] = Integer.parseInt(sNumbers[i]);
                int sumCurr = 0;
                for (int i = 0; i < count; i++)
                    sumCurr += numbers[i];


//System.out.println(Arrays.toString(numbers));
                if (sumCurr == rand)
                    for (int i = 0; i < count; i++) {
                        int index = arr.indexOf(numbers[i]);
                        if (index >= 0) {
                            sum += arr.get(index);
                            arr.remove(index);
                        } else {
                            flag = false;
                        }
                    }
                else break;
            }
            while (arr.size() > 0 && flag);
            System.out.println("Ваш счет: " + sum);
        }
    }

