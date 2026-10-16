package factory;

import decorator.ServiceCharges;

public class UPI implements Payment {
    @Override
    public void pay(double amt) {
        System.out.println("Payment has been done by UPI successfully for amount : " + amt);
    }
}
