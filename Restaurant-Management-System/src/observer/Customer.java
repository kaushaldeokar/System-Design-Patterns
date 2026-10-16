package observer;

import model.OrderItem;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void notify(OrderItem orderItem) {
        System.out.println("Customer " + name + " notified: Your order item " + orderItem.getId() + " is now "+ orderItem.getState().getStateName() + ".");
    }
}
