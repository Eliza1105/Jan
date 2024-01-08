public class Algorithms {
    public static void main(String[] args) {
        //линейный алгоритм
        System.out.println("Пробуждение  ");
        System.out.println("Вставай  ");
        System.out.println("Заправить  постель  ");
        System.out.println("Одевайся  ");
        System.out.println("Выпейте  стакан  воды ");
        System.out.println("Почистить зубы");

        //Разветвленный  алгоритм
        int  points  =  70;
        if  (points<30)
        System.out.println("Ваша  оценка  3  ");
        else  if  (points<50)
            System.out.println("Ваша  оценка  4  ");
        else
            System.out.println("Ваша  оценка  5  ");

        //Циклический  алгоритм
        for  (int  i=0;  i<10;  i++){
            System.out.print("Fall  Forward,  ");
            System.out.print("Нажмите  вверх,  ");
            System.out.println("Встаньте  ");
        }
    }
}
