package Observable;

import Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;


public class AmazonProductObservable implements ObservableInterface{

    List<ObserverInterface>observerList;
    Integer stockCount;

    public AmazonProductObservable(Integer stockCount){
        this.stockCount=stockCount;
        this.observerList = new ArrayList<>();
    }

    public void addUser(ObserverInterface observerInterface){
        observerList.add(observerInterface);
    }
    public void removeUser(ObserverInterface observerInterface){
        observerList.remove(observerInterface);
    }
    public void setStockCount(Integer newStockCount){
        this.stockCount=newStockCount;

        if(stockCount>0){
            notifyObservers();
        }
    }
    public Integer getStockCount(){
        return stockCount;
    }
    public void notifyObservers(){
        for(var observer:observerList){
            observer.update();
        }
    }
}
