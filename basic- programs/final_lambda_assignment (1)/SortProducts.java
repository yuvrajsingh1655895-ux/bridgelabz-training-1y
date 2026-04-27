import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 20000, 4.5));
        list.add(new Product("Laptop", 60000, 4.8));
        list.add(new Product("Watch", 5000, 4.2));

        list.sort((a, b) -> Double.compare(a.price, b.price));

        for(Product p : list)
            System.out.println(p.name + " " + p.price);
    }
}
