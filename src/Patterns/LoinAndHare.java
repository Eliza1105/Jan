package Patterns;
//Bridge
public class LoinAndHare {
    public static void main(String[] args) {
Lion lion = new StupidLion();
Hare hare = new CleverHere();
hare.meetWithLion(lion);
    }
}

abstract class Lion{
    public boolean wit;
    abstract public void meetWithHare(Hare hare);
}

abstract class Hare{
    public boolean wit;
    abstract public void meetWithLion (Lion lion);
}
class CleverHere extends Hare {
public CleverHere(){
    this.wit = true;
}
    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("The Lion is clever, my attempt fails");
        else System.out.println("The Lion is stupid, i will try to fool him");
        lion.meetWithHare(this);
    }
}

class StupidLion extends Lion{
    public StupidLion() {
        this.wit = true;
    }
    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit)
            System.out.println("What? Another lion in my jungle? Take me to him immediately.");
        else System.out.println("It is another hare. I'm very hungry.");
    }
}
