import java.util.Scanner;

public class Simulator {
    private static VendingMachine machine;

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        machine = new VendingMachine();
        machine.printAllProducts();
        askPayment();
        askToAddMoney();
    }

    private static void askToAddMoney() {
        try{
            System.out.println("How much you want to add?");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n<0) throw new Exception();
            machine.getCash().addMoney(n);
            System.out.println("Your money is: "+machine.getCash().getTotal());
            machine.setProductsThatCanBuy(machine.getCash().getTotal());
            machine.printProductsThatCanBuy();
            whichProductYouWant();
        }catch (Exception e){
            System.out.println("Wrong input!");
            askToAddMoney();
        }
    }

    private static void whichProductYouWant() {
        try {
            System.out.println("0 - Add money");
            for (int i = 1; i <=machine.getProductsThatCanBuy().size(); i++) {
                System.out.println(i+" - Buy "+machine.getProductsThatCanBuy().get(i-1));
            }
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n){
                case 0:
                    askToAddMoney();
                    break;
                default:
                    machine.getCash().buyProduct(machine.getProductsThatCanBuy().get(n-1));
                    System.out.println("you buy "+machine.getProductsThatCanBuy().get(n-1));
                    System.out.println("Your change is " + machine.getCash().returnCash());
            }
        }catch (Exception e){
            System.out.println("Wrong input!");

        }
    }

    private static void askPayment() {
        try{
            System.out.println("Choose payment system!");
            System.out.println("1 - By Money");
            System.out.println("2 - By Card");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n!=1 && n!=2) throw new Exception();
            machine.addPaymentSystem(n);
        }catch (Exception e){
            System.out.println("Wrong input!");
            askPayment();
        }
    }
}
