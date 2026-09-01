
class bankDemo {

    int accountNumber;
    String name;
    double balance;

    void display() {
        System.out.println("Account Number: " + accountNumber);

        System.out.println("Name: " + name);

        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {
        bankDemo b = new bankDemo();

        b.accountNumber = 25;
        b.name = "Gopal";
        b.balance = 550000;

        b.display();
    }
}
