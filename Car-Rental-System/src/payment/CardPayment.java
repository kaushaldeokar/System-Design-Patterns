package payment;


public class CardPayment extends Payment{

    public CardPayment(Bill bill){
        super(bill);
    }

    @Override
    public double processPayment(){
        System.out.println("Processing card Payment");
        return 100+50;
    }
}
