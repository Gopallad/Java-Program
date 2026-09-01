
class BankAccount {

    int accountNumber;
    String name;
    double balance;

    public BankAccount() {
    }

    BankAccount(int a, String n, double b) {
        accountNumber = a;
        name = n;
        balance = b;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance
        );
    }

}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount a = new BankAccount(232322, "Gopal", 7550000);

        a.display();

    }
}
