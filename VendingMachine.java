import java.util.ArrayList;
import java.util.stream.Collectors;

public class VendingMachine {
    private ArrayList<Product> products;
    private ArrayList<Product> productsThatCanBuy;
    private PaymentSystem cash;
    public VendingMachine() {
        products = Product.getProducts();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Product> getProductsThatCanBuy() {
        return productsThatCanBuy;
    }

    public void setProductsThatCanBuy(int money){
        productsThatCanBuy = (ArrayList<Product>) products.stream().filter(m->m.getCost()<=money).collect(Collectors.toList());
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public PaymentSystem getCash() {
        return cash;
    }

    public void setCash(PaymentSystem cash) {
        this.cash = cash;
    }

    public void addPaymentSystem(int n){
        switch (n){
            case 1:
                System.out.println("You selected payment By Money");
                cash = new ByCash();
                break;
            case 2:
                System.out.println("You selected payment By Card");
                cash = new ByCard();

        }
    }
    public void printAllProducts(){
        System.out.println("****Al products in Machine****");
        for (Product p:products
             ) {
            System.out.println(p.toString());
        };
    }
    public void printProductsThatCanBuy(){
        if (productsThatCanBuy==null) System.out.println("You can't buy anything!");
        else {
            System.out.println("****You can buy****");
            for (Product p : productsThatCanBuy
            ) {
                System.out.println(p.toString());
            }
        }
    }
}
