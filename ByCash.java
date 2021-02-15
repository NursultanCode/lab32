public class ByCash implements PaymentSystem{
    private int total;
    public ByCash() {
        total = 0;
    }

    public int getTotal(){
        return total;
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
}
