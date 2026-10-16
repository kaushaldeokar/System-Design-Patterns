package state;

import model.OrderItem;

public interface OrderItemState {
    void prepare(OrderItem context);
    void serve(OrderItem context);
    void complete(OrderItem context);
    String getStateName();
}

