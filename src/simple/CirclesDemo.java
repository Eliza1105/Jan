package simple;

import java.util.concurrent.Callable;

public class CirclesDemo {
    public static void main(String[] args) {
        //Вычислить длину окружности и площадь круга
        //Императивный
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;

        double l1 = 2*Math.PI*r1;
        double s1 = Math.PI*r1*r1;
        double l2 = 2*Math.PI*r2;
        double s2 = Math.PI*r2*r2;
        double l3 = 2*Math.PI*r3;
        double s3 = Math.PI*r3*r3;
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,l1,s1);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r2,l2,s2);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r3,l3,s3);

        //Процедурный
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,calcLength(r1),calcArea(r1));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r2,calcLength(r2),calcArea(r2));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r3,calcLength(r3),calcArea(r3));

        //ООП
        Circle circle = new Circle(1); //Конструктор
        new Circle(r1).print(); //Анонимный
        new Circle(r2).print();
        new Circle(r3).print();
        System.out.println(Circle.desc);
        System.out.println(Circle.calcLength(r1));
        System.out.println(circle.toString());
    }

    static double calcLength(double r){
        return 2*Math.PI*r;
    }

    static double calcArea(double r){
        return Math.PI*r*r;
    }
}

class Circle{
    private double radius;
    private double length;
    private double area;
    public static final String desc = "Это окружность";

    public Circle(double radius) {
        this.radius = radius;
        calcLength();
        calcArea();
    }

    public void calcLength(){
        length = 2*Math.PI*radius;
    }

    public void calcArea(){
        area = Math.PI*radius*radius;
    }

    public static double calcLength(double radius){
        return 2*Math.PI*radius;
    }

    public static double calcArea(double radius){
        return Math.PI*radius*radius;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public void print(){
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",radius,length,area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
