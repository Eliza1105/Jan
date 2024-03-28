package mbBounded;

public class MagicBoxBounded {
    public static void main(String[] args) {
MBBounded<Animal> mbBounded = new MBBounded<>(new Cat());

//wildcard
        MBBounded<?> mbBounded1 = new MBBounded<>(new Bird());
//upper bounded
        MBBounded<? extends Bird> mbBounded2 = new MBBounded<>(new WhitePigeon());
//lower bounded
        MBBounded<? super Pigeon> mbBounded3 = new MBBounded<>(new WhitePigeon());
    }
}
class MBBounded <T extends Animal>{
    private T obj;

    public MBBounded(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}