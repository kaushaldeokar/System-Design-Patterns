package decorator;

import model.Order;

public class ServiceCharges implements Services {

    private final Bill bill;
    private final double serviceCharges;
    public ServiceCharges(Bill bill) {
        this.bill = bill;
        this.serviceCharges = 1000;
    }


    public double totalCost() {
        return serviceCharges + bill.totalCost();
    }
}
