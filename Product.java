import java.util.ArrayList;

public class Product {
    String name;
    int cost;

    public static ArrayList<Product> getProducts(){
        ArrayList<Product> products= new ArrayList<>();
        Product pepsi = new Pepsi();
        Product cola = new CocaCola();
        Product milk = new Milk();
        Product bisque = new Bisque();
        products.add(pepsi);
        products.add(cola);
        products.add(milk);
        products.add(bisque);
        return products;
    }

    @Override
    public String toString() {
        return "["+cost+"] "+name;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
