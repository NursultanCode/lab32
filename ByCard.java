import java.util.Scanner;

public class ByCard implements PaymentSystem{
    private int total;
    public ByCard() {
        total = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Control is not working you can print anything!");
        System.out.println("Enter you card Number:");
        String number = scanner.next();
        System.out.println("Enter your password:");
        String pass = scanner.next();
    }
    @Override
    public void addMoney(int n) {
        total+=n;
    }

    @Override
    public void buyProduct(Product product) {
        total-= product.getCost();
    }

    @Override
    public int returnCash() {
        return total;
    }

    @Override
    public int getTotal() {
        return total;
    }
}
