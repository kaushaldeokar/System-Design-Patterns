package payment;

public class CashPayment extends Payment{

    public CashPayment(Bill bill){
        super(bill);
    }

    @Override
    public double processPayment(){
        System.out.println("Processing cash Payment");
        return 100+30;
    }
}
