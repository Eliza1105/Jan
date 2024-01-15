//1. Вывести все двухзначные числа, которые делятся на 3,
// но не делятся на 5, но при этом делятся на 3 и на 5 одновременно
public class Classwork1501 {
    public static void main(String[] args) {
for (double i=10; i<=99; i++){
    if ((i%3==0)&&(i%5!=0)){
        System.out.println(i);
    }
}
    }
}
