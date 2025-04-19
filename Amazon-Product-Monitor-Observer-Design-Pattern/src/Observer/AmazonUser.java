package Observer;

import Observable.ObservableInterface;

public class AmazonUser implements ObserverInterface{

    String phoneNumber;
    ObservableInterface observableInterface;

    public AmazonUser(String phoneNumber,ObservableInterface observableInterface){
        this.phoneNumber=phoneNumber;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        System.out.println("Sending alert on phone number : "+phoneNumber+" with stock count : "+observableInterface.getStockCount());
    }
}
