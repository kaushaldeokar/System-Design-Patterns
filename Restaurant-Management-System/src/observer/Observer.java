package observer;

import model.OrderItem;

public interface Observer {
    void notify(OrderItem orderItem);
}
