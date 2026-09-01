
class Account {

    String name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

}

public class BankAccuntDemo {

    public static void main(String[] args) {
        Account a = new Account();

        a.name = "Gopal";
        a.balance = 500;

        a.deposit(100);
        a.withdraw(600);

        a.display();
    }
}
