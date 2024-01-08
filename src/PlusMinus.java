public class PlusMinus {
    public static void main(String[] args) {
        double t=1.0;
        String answer=t>0? "Above zero": "Below zero"; //Тернарный оператор
        System.out.println(answer);

        //Дано двузначное число. определить: одинаковы ли его цифры
        int number = 11;
        System.out.println(number/10==number%10?true:false);
        //найти максимальное из двух чисел
        int a= 2; int b=3;
        System.out.println(a>b?a:b);

        //
    }
}
