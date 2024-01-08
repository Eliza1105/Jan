package simple;


public class Pen {
    private Color color; // object
    Pen(Color color){
        this.color =color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                '}';
    }
}
