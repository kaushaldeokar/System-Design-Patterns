package payment;

import reservation.Ticket;

public class Bill {
    Ticket ticket;
    PaymentType paymentType;

    PaymentFactory paymentFactory;


    public Bill(Ticket ticket,PaymentType paymentType){
        this.ticket=ticket;
        this.paymentType=paymentType;
        paymentFactory= new PaymentFactory(this);
    }

    public double calAmountAndProcess(){

        Payment payment=paymentFactory.paymentHashMap.get(paymentType);
        return payment.processPayment();

    }
}
