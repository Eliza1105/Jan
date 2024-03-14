package Patterns;

import java.util.ArrayList;

public class OneNutAndTwoBoys {
    public static void main(String[] args) {
        TallBoy tallBoy = new TallBoy();//mediator
Boy first = new LittleBoy(tallBoy);
Boy second = new LittleBoy(tallBoy);
tallBoy.addBoy(first);
tallBoy.addBoy(second);
first.request(5);
tallBoy.response();
    }
}
interface Mediator {
    void response();
    void setTotal(int total);

}
abstract class Boy {
    protected final Mediator mediator;
    public Boy(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive(int count);
    public abstract void request(int count);
}
class TallBoy implements Mediator {

    private final ArrayList<Boy> boys;
    private int total = 0;

    public TallBoy() {
        boys = new ArrayList<>();
    }

    public void addBoy(Boy boy) {
        boys.add(boy);
    }

    @Override
    public void response() {
        //let all other  know that this has changed
        int countOfBoys = boys.size();
        int count = total / countOfBoys;
        int remainder = total % countOfBoys;
        for (Boy currBoy : boys) {
            //don't tell ourselves
            currBoy.receive(count);
        }
        System.out.println("Mediator: Total count of nuts is " + total + ". " + remainder + " nuts is (are) mine.");
    }

    @Override
    public void setTotal(int total) {

        this.total
                = total;
    }
}

class LittleBoy extends Boy {

    public LittleBoy(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(int count) {
        System.out.println("Boy: I got " + count + " nuts. ");
    }

    @Override
    public void request(int count) {
        mediator.setTotal(count);
    }
}