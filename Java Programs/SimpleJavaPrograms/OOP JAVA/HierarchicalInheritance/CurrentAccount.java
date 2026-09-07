
class Bank {

    void deposit() {
        System.out.println("Money Deposited");
    }
}

class SavingsAccount extends Bank {

    void save() {
        System.out.println("Savings account");
    }
}

public class CurrentAccount extends SavingsAccount {

    void business() {
        System.out.println("Current account for business");
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.deposit();
        s.save();

        CurrentAccount c = new CurrentAccount();

        c.deposit();
        c.business();
    }

}
