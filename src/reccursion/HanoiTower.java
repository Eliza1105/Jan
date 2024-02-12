package reccursion;

public class HanoiTower {
    /*
Рекурсивно решаем задачу «перенести башню из n−1 диска на 2-й стержень».
Затем переносим самый большой диск на 3-й стержень.
Рекурсивно решаем задачу «перенести башню из n−1 диска на 3-й стержень».
 */
        private static int count = 28;//колво дисков на 0 стржне
        private static int[][] discs = new int[count][3]; //для хранения количества дисков
        private static int[] counts = new int[3];// текущее колво на каждом стержне
private static int n=0;
        public static void main(String[] args) {
            init();
            System.out.println(toStringAligned());
            //moveOne(0,1);
          move(count,0,1,2);
            System.out.println(toStringAligned());
            System.out.println(n);
        }

        //Первоначальное расположение
        public static void init() {
            for (int i = 0; i < count; i++)
                discs[i][0] = count-i;
            counts[0] = count; //Заполнили первый стержень
        }
    //
    public static void moveOne(int from, int to){
            if (counts[from]!=0) {
                discs[counts[to]++][to] = discs[--counts[from]][from];
                discs[counts[from]][from] = 0;
            }
    }
    //
    public static void move(int count, int from, int aux, int to){
            if (count==1){
                moveOne(from,to);
            }
            else {
                move(count-1,from,to,aux); //снять верхний диск
                moveOne(from,to);// снять последний диск
                move(count-1,aux,from,to);// поставить на последний стержень
                n++;
            }
    }
    //Преобразовать в строку с выравниванием
    public static String toStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = count-1; i >=0; i--) {
            for (int j = 0; j<3; j++) {
                String sNumber = Integer.toString(discs[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        result.append("___________\n");
        return result.toString();
    }

}
