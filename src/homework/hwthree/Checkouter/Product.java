package homework.hwthree.Checkouter;

/**
 * Created by polosatik on 02.10.17.
 */
public class Product{
    String name;
    int num;
    double price;

    public Product(String name, int num, double price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }
}
