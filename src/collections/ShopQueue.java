package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Очередь в магазин. Каждый покупатель имеет корзину, в каждой корзине набор товаров определенной цены.
//После обслуживания покупателя сумма в кассе увеличивается.
//Без очереди обслуживаются ветераны, затем дети до 10 лет
public class ShopQueue {
    public static void main(String[] args) {
Product water = new Product("Water", 2.10);
Product butter = new Product("Butter", 3.40);
Product cheese = new Product("Cheese", 4.15);
Product bread = new Product("Bread", 1.99);

Customer customer1 = new Customer(TypeCustomer.REGULAR);
customer1.basket.add(water);
customer1.basket.add(bread);

Customer customer2 = new Customer(TypeCustomer.VETERAN);
customer2.basket.add(cheese);
customer2.basket.add(bread);
customer2.basket.add(butter);

Customer customer3 = new Customer(TypeCustomer.CHILD);
        customer3.basket.add(cheese);
        customer3.basket.add(water);


        Queue<Customer> queue = new PriorityQueue<>();
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);

 Seller seller = new Seller();
 double sum = 0;
while (!queue.isEmpty()){
    //System.out.println(queue.poll());
    queue.peek();
    Customer customer = queue.poll();
    sum+=seller.calcSum(customer);
    System.out.println(customer.type+ " "+seller.calcSum(customer));

}
        System.out.println("Total: "+ sum);
    }
}

class Product{
    String name;
    double price;
    Product(String name, double price){

        this.name = name;
        this.price = price;
    }
}

enum TypeCustomer{
    VETERAN, CHILD, REGULAR;
}

class Customer implements Comparable{

    public TypeCustomer type;
    public List<Product> basket = new ArrayList<>();

    public Customer(TypeCustomer type) {
        this.type = type;
    }

    @Override
    public int compareTo(Object o) {
        int index1 = this.type.ordinal();
        int index2 = ((Customer)o).type.ordinal();//Приведение (Кастинг) типа объекта
        return index1-index2;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type=" + type +
                '}';
    }
}

class  Seller{
    public  double calcSum(Customer customer){
        double sum= customer.basket
                .stream()
                .mapToDouble(p->p.price)
                .sum();
        return sum;
        }
    }
