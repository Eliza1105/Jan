package Exeptions;

import java.util.Scanner;

public class BuildingExeptions {
    public static void main(String[] args) {
      /*  int [] arr = {1,2,3};
        int a = arr[3];
try {
    int i = arr[3];

}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Превышена длинна массива");
}

       */
        TestClass testClass = null;
        try {
            testClass.print();
        } catch (NullPointerException e) {
            System.out.println("Null pointer");;
        }
        System.out.println("ok");

       try{
           int a = Integer.parseInt("1.2");
       } catch (NumberFormatException e) {
           System.out.println("number format");
       }
    }
        static void processInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a=0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong number");
            e.printStackTrace(); //cтандартный вывод стека в консоль
        }
        System.out.println(a);
    }
    static void processDivideByZero() {
        int a = 1, b, c = 0;
        if (c != 0) {
            b = a / c;
        } else {
            System.out.println("c is zero!");
        }
    }
    class TestClass {
        private int i=0;
        public void print(){
            System.out.println("print");
        }
    }
}
