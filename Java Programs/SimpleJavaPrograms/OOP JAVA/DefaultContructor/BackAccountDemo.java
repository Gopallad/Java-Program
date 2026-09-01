
class Bank {

    double balance;

    public Bank() {
        balance = 1000;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

}

public class BackAccountDemo {

    public static void main(String[] args) {
        Bank a = new Bank();
        a.display();
    }
}
