package state;

import model.OrderItem;

public class OrderItemCompleteState implements OrderItemState {
    @Override
    public void prepare(OrderItem context) {
        System.out.println("Order item is already completed. Cannot prepare.");
    }

    @Override
    public void serve(OrderItem context) {
        System.out.println("Order item is already completed. Cannot serve.");
    }

    @Override
    public void complete(OrderItem context) {
        System.out.println("Order item is already completed.");
    }

    @Override
    public String getStateName() {
        return "Completed";
    }
}
