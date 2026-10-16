package state;

import model.OrderItem;

public class OrderedSate implements OrderItemState {
    @Override
    public void prepare(OrderItem context) {
        System.out.println("Preparing the order item.");
        context.setState(new PreparingState());
        context.notifyObservers();
    }

    @Override
    public void serve(OrderItem context) {
        System.out.println("Order item is not prepared yet. Cannot serve.");
    }

    @Override
    public void complete(OrderItem context) {
        System.out.println("Order item is not prepared yet. Cannot complete.");
    }

    @Override
    public String getStateName() {
        return "Ordered";
    }
}
