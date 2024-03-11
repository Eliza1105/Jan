package Patterns;

public class OneNutAndTwoBoys {
    public static void main(String[] args) {

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