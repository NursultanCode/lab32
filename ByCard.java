public class ByCard implements PaymentSystem{
    private int total;
    public ByCard() {
        total = 0;
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
