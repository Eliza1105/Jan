public class Task4_1 {
    public static void main(String[] args) {
        double x=0, y;
        y=Math.sin(x)*Math.sin(x);
        y= 1-2*Math.sin(x*x);
        if (x>0)
            y=Math.sin(x)*Math.sin(x);
        else
            y= 1-2*Math.sin(x*x);
        System.out.println(y);
    }
}
