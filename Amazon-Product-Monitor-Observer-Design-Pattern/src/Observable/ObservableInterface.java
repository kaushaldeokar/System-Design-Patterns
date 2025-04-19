package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface {
    public void addUser(ObserverInterface observerInterface);
    public void removeUser(ObserverInterface observerInterface);
    public void setStockCount(Integer newStockCount);
    public Integer getStockCount();
    public void notifyObservers();
}
