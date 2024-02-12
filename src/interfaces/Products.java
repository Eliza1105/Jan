package interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        House house = new House();
        house.sell();

        Refrigerator refrigerator = new Refrigerator(100,50);
        refrigerator.sell();

        List<Product> products = new ArrayList<>();
        products.add(house);
        products.add(refrigerator);


        Comparator<Sellable> compPrice = Comparator.comparing(product -> product.getPrice());
    }
}
abstract class Product{
    protected String name;
    public abstract void sell();
}

interface Sellable{
    public int getPrice();
}

interface Transportable{
    public  double getWeight();
}

class Refrigerator extends Product implements Sellable, Transportable{
private  int price;
private  double weight;

    public Refrigerator(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void sell() {
        System.out.println("The refrigerator is sold");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

class House extends Product implements Sellable, Transportable{

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}