import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        double year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("високосный");
        else
            System.out.println("невисокосный");
    }
}
