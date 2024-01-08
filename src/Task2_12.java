public class Task2_12 {
    public static void main(String[] args) {
        int a=123;
        int onec=a%10;
        int tens=a%100-onec/10;
        tens= a/10%10;
        int h=a/100;
        System.out.println(onec);
        System.out.println(tens);
        System.out.println(h);
    }
}
