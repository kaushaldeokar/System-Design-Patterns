import Observable.AmazonProductObservable;
import Observable.ObservableInterface;
import Observer.AmazonUser;
import Observer.ObserverInterface;

public class Main {
    public static void main(String[] args) {



        ObservableInterface iphone = new AmazonProductObservable(0);

        ObserverInterface kaushal = new AmazonUser("7489362562",iphone);

        iphone.addUser(kaushal);

        iphone.setStockCount(10);


    }
}