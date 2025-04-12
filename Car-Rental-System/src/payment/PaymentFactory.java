package payment;

import java.util.HashMap;

public class PaymentFactory {

    public HashMap<PaymentType,Payment>paymentHashMap;

    public PaymentFactory(Bill bill){
        paymentHashMap = new HashMap<>();
        paymentHashMap.put(PaymentType.CARD,new CardPayment(bill));
        paymentHashMap.put(PaymentType.CASH,new CashPayment(bill));

    }
}
