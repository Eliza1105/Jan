package interfaces;

import java.util.ArrayList;
import java.util.List;

public class AnimalSchool {
    public static void main(String[] args) {
        Duck duck= new Duck();
        duck.run();
        duck.swim();

        Squirrel squirrel = new Squirrel();
        squirrel.climb();
        squirrel.run();


        List<Running> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(squirrel);
        for (Running animal:animals)
animal.run();
    }
}

//Причастие, содержит нереализованные , но запланированные дей-я
//bstract class vs Interface
interface Running{
    public void run();
}
interface  Swimming{
    public void swim();
}
interface  Climbing{
    public void climb();
}

class Duck implements Running, Swimming{

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
class Squirrel implements  Running, Climbing{

    @Override
    public void run() {
        System.out.println("Squirrel is running");
    }

    @Override
    public void climb() {
        System.out.println("Squirrel is climbing");
    }
}