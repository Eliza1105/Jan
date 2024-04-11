package control;

import java.util.Scanner;

/* На поле размером nxm размещены корабли (2 трехпалубных, 3 двухпалубных, 4 однопалубных)
       [[0,0,0,1,1,0],
        [0,1,0,0,0,0],
        [0,1,0,1,0,0],
        [0,1,0,1,0,0]];

При ходе [2, 1] программа выдает число 3, т.к. подбит трехпалубный корабль
При ходе [1, 3] программа выдает число 0 (промах) и т.д.
Изменить условие так, чтобы каждый из кораблей мог "отразить" одну атаку, выдав 0 при первом попадании в него.
Разработать алгоритм, который подобьет все корабли если не за минимальное, то за некоторое удовлетворительное число ходов.
 */
public class SeaBattle {
    static int rows = 8;
    static int cols = 8;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты удара:");

        arr = new int[rows][cols];
        int i = scanner.nextInt()-1;
        int j = scanner.nextInt()-1;
                if ((i<4)&&(i>0)||(j==1))
                    System.out.println("3");
                if ((i<=5)&&(i>=3)||(j==3))
                    System.out.println("3");
                if ((i==0)||(j==3)&&(j==4))
                    System.out.println("2");
                if ((i==1)||(j==6)&&(j==7))
                    System.out.println("2");
                if ((i==7)||(j==3)&&(j==4))
                    System.out.println("2");
                if ((i==6)||(j==1))
                    System.out.println("1");
                if ((i==5)||(j==5))
                    System.out.println("1");
                if ((i==3)||(j==6))
                    System.out.println("1");
                if ((i==7)||(j==6))
                    System.out.println("1");
                else System.out.println("0");

            }
            //public int attack(int x,int y){


        }


