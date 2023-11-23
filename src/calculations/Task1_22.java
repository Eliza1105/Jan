package calculations;

public class Task1_22 {
    public static void main(String[] args) {
        double x = 1;
        double y = 7*x*x-3*x+6;
        System.out.println("y= "+y);
        double a = 8.;
        System.out.println(Math.cbrt(a));
        double h=1.68, r=6350_0000;
        double l=Math.sqrt((r+h)*(r+h)-r*r);
        System.out.println(l);
    }
}
