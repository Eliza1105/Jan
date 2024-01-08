package simple;

public class Car {
    private Color color = Color.GRAY;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                '}';
    }
}
