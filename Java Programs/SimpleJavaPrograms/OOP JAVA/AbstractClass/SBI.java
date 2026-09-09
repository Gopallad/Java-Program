
abstract class Bank {

    void welcome() {
        System.out.println("Welcome to Bank");
    }

    abstract void interestRate();
}

class SBI extends Bank {

    void interestRate() {
        System.out.println("SBI interest Rate is 7%");
    }

    public static void main(String[] args) {
        SBI a = new SBI();

        a.welcome();
        a.interestRate();
    }
}
