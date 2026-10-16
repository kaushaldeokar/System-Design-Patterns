package model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;
    private Table table;
    private Waiter waiter;
    private Map<String,OrderItem> orderList;

    public Order(String id, Table table, Waiter waiter) {
        this.id = id;
        this.table = table;
        this.waiter = waiter;
        this.orderList = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Map<String, OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<String, OrderItem> orderList) {
        this.orderList = orderList;
    }

    public void addOrderItem(String id, OrderItem item) {
        orderList.put(id, item);
    }

    public void removeOrderItem(String id) {
        orderList.remove(id);
    }


}
