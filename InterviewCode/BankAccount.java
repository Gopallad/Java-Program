public class BankAccount {

    private double balance = 10000;

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successfully");
        } else {
            System.out.println("Deposit failure");
        }
    }

    public void withDraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("WithDraw Successfully");
        } else {
            System.out.println("Insufficient Balance or Invalid amount");
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount a = new BankAccount();

        a.deposit(5000);

        System.out.println(a.getBalance());
    }
}