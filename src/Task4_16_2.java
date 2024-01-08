import java.util.Scanner;

public class Task4_16_2 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                System.out.print("Введите площадь круга: ");
                double areaCircle = scanner.nextDouble();

                System.out.print("Введите площадь квадрата: ");
                double areaSquare = scanner.nextDouble();

                double sideSquare = Math.sqrt(areaSquare); // вычисляем длину стороны квадрата по его площади

                double radiusCircle = Math.sqrt(areaCircle / Math.PI); // вычисляем радиус круга по его площади

                double diagonalSquare = Math.sqrt(2 * sideSquare * sideSquare); // вычисляем диагональ квадрата

                if (diagonalSquare <= 2 * radiusCircle) {
                    System.out.println("Квадрат умещается в круге");
                } else {
                    System.out.println("Квадрат не умещается в круге");
                }
            }
}
