interface Payment {
    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Card");
    }
}

public class UpiDemo {
    public static void main(String[] args) {

        Payment p;   // Interface reference

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}
