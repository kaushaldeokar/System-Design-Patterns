package state;

import model.OrderItem;

public class ReadyToServeState implements OrderItemState {
    @Override
    public void prepare(OrderItem context) {
        System.out.println("Order item is already prepared and ready to be served.");
    }

    @Override
    public void serve(OrderItem context) {
        System.out.println("Serving the order item.");
    }

    @Override
    public void complete(OrderItem context) {
        System.out.println("Order item is already ready to be served. Cannot complete.");
    }

    @Override
    public String getStateName() {
        return "Ready to Serve";
    }
}
