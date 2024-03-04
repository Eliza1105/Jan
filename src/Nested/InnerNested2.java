package Nested;

public class InnerNested2 {
    public static void main(String[] args) {
Car car = new Car();
car.driver.go();

Car.Player passenger = new Car.Player();
passenger.play();
        System.out.println(Car.playerOn);

        car.move();
        car.play();
    }
}

class Car{
    //Руль находится внутри автомобиля, поэтому private
    private int wheelAngle = 0; //Angle of rotating
    private boolean ignitionOn = false; //Key of ignition
    public static boolean playerOn = false; //Car's player
    public Driver driver = new Driver(); //ввели, чтоб он мог менять внутренние поля


    //2.Inner class
    protected class Driver{//может войти в Кар и поменять внутренние настройки
        public void go(){
            wheelAngle = 30;
            ignitionOn = true;
            playerOn = true;
        }
    }
    public static class Player{
        public void play(){
            Car.playerOn = true;
        }
    }

    //Local class

    public void move(){
        class Navigator {
            public void navigate(){
                System.out.println("navigate");
            }
        }
        Navigator navigator = new Navigator();
        navigator.navigate();
    }
    //Чтобы создать анонимный класс, нужен родительский класс или интерфейс, только объявление
    interface Remotable{
        void remote();
    }
    //4.Anonymous class
    public void play(){
        new Remotable(){
            @Override
            public void remote() {
                playerOn = true;
                System.out.println("play");
            }
        }.remote();
    }
}
