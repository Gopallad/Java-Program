
interface payment {

    void pay();
}

class UPI implements payment {

    public void pay() {
        System.out.println("Payment using UPI");
    }
}

class Card implements payment {

    public void pay() {
        System.out.println("Payment using Card");
    }
}

public class PaymentInterface {

    public static void main(String[] args) {
        UPI a = new UPI();

        a.pay();

        Card c = new Card();

        c.pay();
    }
}
