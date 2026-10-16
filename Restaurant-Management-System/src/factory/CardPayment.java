package factory;

public class CardPayment implements Payment {
    @Override
    public void pay(double amt) {
        System.out.println("Payment has been done by CARD successfully for amount : " + amt);
    }
}
