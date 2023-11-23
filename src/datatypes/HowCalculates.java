package datatypes;

public class HowCalculates {
    public static void main(String[] args) {
        double a=5./3; //+-*/
        System.out.println(a);

        double m=1/3;
        System.out.println(m);

        double y=1./2/Math.sin(Math.PI/2);
        System.out.println(y);

        a=2./0;
        System.out.println(a);

        y=a*1;
        System.out.println(y);
    }
}
