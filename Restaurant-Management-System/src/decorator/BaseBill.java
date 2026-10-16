package decorator;

import model.Order;
import model.OrderItem;

public class BaseBill implements Bill {

    private final Order order;
    public BaseBill(Order order) {
        this.order = order;
    }
    @Override
    public double totalCost() {
        return order.getOrderList().values().stream()
                .mapToDouble(item -> item.getMenuItem().getPrice()) // adjust method name
                .sum();
    }
}