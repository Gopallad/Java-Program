
public class BankAccount {

    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(5000);
        System.out.println("Balance: " + b.getBalance());
    }
}
