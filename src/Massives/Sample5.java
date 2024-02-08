package Massives;

import java.util.Arrays;

public class Sample5 {
    //Поместить в массив все простые трехзначные числа, являющиеся палиндромами.
    public static void main(String[] args) {
        //определить длину массива
        //является ли число простым
        //является ли число полиндромом
        //System.out.println(prime(8));
        System.out.println(countLength());
// оздать массив требуемой длины
        int count = countLength();
        int[] arrayInt = new int[count];
        //заполнить массив
        arrayInt= makeArray(count);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(makeArray(countLength())));
    }

    static boolean prime(int num) {
        if (num < 2)
            return false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    static int countLength() {
        int count = 0;
        for (int num = 100; num < 1000; num++) {
            if (num / 100 == num % 10 && prime(num)) {
                count++;
            }
        }
        return count;
    }

    static int[] makeArray(int count) {
        int[] Palindromes = new int[count];
        int index = 0;
        for (int num = 100; num < 1000; num++) {
            if (num / 100 == num % 10 && prime(num)) {
                Palindromes[index++] = num;
            }
        }
                return Palindromes;
    }
}



