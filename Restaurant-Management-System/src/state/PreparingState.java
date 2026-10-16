package state;

import model.OrderItem;

public class PreparingState implements OrderItemState {
    @Override
    public void prepare(OrderItem context) {
        System.out.println("Order item is already being prepared.");
    }

    @Override
    public void serve(OrderItem context) {
        System.out.println("Cannot serve order item while it is being prepared.");
    }

    @Override
    public void complete(OrderItem context) {
        System.out.println("Order item preparation completed. Now ready to be served.");
    }

    @Override
    public String getStateName() {
        return "Preparing";
    }
}
