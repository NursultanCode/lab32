public interface PaymentSystem {
    public void addMoney(int n);
    public void buyProduct(Product product);
    public int returnCash();
    public int getTotal();
}
