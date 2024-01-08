import java.util.Scanner;

public class Task4_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Введите площадь круга: ");
                double circleArea = scanner.nextDouble();
                System.out.print("Введите площадь квадрата: ");
                double squareArea = scanner.nextDouble();

                // Вычисляем радиус круга по его площади
                double circleRadius = Math.sqrt(circleArea / Math.PI);

                // Вычисляем длину стороны квадрата по его площади
                double squareSide = Math.sqrt(squareArea);

                // Проверяем, уместится ли круг в квадрате
                if (circleRadius <= squareSide / 2) {
                    System.out.println("Круг умещается в квадрате");
                } else {
                    System.out.println("Круг не умещается в квадрате");


                            }
                        }
                    }
