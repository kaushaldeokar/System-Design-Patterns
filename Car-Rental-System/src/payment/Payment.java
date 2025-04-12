package payment;

public class Payment {
    Bill bill;

    public Payment(Bill bill){
        this.bill=bill;
    }

    public double processPayment(){
        return 100.0;
    }
}
