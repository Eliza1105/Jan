public class Task2_16 {
    public static void main(String[] args) {
        int a=123;
        int o=a%10;
        int t=a/10%10;
        int h=a/100;
        int b=(t*100)+(h*10)+o;
        System.out.println(b);
    }
}
