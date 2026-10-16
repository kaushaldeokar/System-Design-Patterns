package model;

import observer.Observer;
import state.OrderItemState;
import state.OrderedSate;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private String id;
    private MenuItem menuItem;
    private int quantity;
    private OrderItemState state;
    private final List<Observer> observers;

    public OrderItem(String id, MenuItem menuItem, int quantity) {
        this.id = id;
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.state = new OrderedSate(); // Initial state is Ordered
        this.observers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItemState getState() {
        return state;
    }

    public void setState(OrderItemState state) {
        this.state = state;
    }

    public List<Observer> getObservers(){
        return observers;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.notify(this);
        }
    }


}
