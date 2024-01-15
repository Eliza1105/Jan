package Games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //Компьютер загадывает число от 1 до 100
        Random random = new Random();
        int number = random.nextInt(100)+1;
        //System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int guessed = 0;
        while (guessed!=number) {
            System.out.println("Введите число :  ");
            guessed = scanner.nextInt();
            if (guessed < number)
                System.out.println("Больше");
            else if (guessed > number)
                System.out.println("Меньше");
            else
                System.out.println("Угадали!!!");
        }
    }
}
