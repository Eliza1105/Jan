public class Task3_29 {
    public static void main(String[] args) {
        //Записать условие, которое является истинным, когда:
        //а) каждое из чисел X и Y нечетное;
        //б) только одно из чисел X и Y меньше 20;
        //в) хотя бы одно из чисел X и Y равно нулю;
        //г) каждое из чисел X, Y, Z отрицательное;
        //д) только одно из чисел X, Y и Z кратно пяти;
        //е) хотя бы одно из чисел X, Y, Z больше 100
        int a=23, b=25;
        boolean b1= (a%2==1)&&(b%2==1);
        boolean b2 = (a<20)^(b<20);
        boolean b3=((a<20)&&!(b<20)||!(a<20)&&(b<20));
        boolean b4 = (a==0)||(b==0);
        boolean b5= (a%5==0)^(b%5==0);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
