
class Bank {

    int AccountNo;
    String name;
    double balance;

    Bank() {
        AccountNo = 0;
        name = "SBI";
        balance = 450000;
    }

    Bank(int accountNo) {
        this.AccountNo = accountNo;
    }

    public Bank(int AccountNo, String name, double balance) {
        this.AccountNo = AccountNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(AccountNo + " " + name + " " + balance
        );
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        Bank b1 = new Bank(1233455);

        Bank b2 = new Bank(123, "HDFC", 560000);

        b.display();
        b1.display();
        b2.display();
    }

}
