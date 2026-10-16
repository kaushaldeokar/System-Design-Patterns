import model.*;
import observer.Customer;

public class RestaurantManagementSystemDemo {

    public static void main(String[] args) {

        RestaurantManagementSystem rms = new RestaurantManagementSystem();
        // add a restaurant
        Restaurant restaurant = new Restaurant("1","MP68 Restaurant");
        rms.addRestaurant("1", restaurant);

        // create a menu item
        MenuItem pizza = new MenuItem("1", "Pizza", 10.99);
        restaurant.getMenu().addMenuItem("1", pizza);

        // create Table
        Table table = new Table("1", 4);
        restaurant.addTable("1", table);

        Waiter waiter = new Waiter("1", "Alice");
        Chef chef = new Chef("2", "Bob");
        restaurant.addStaff("1", waiter);
        restaurant.addStaff("2", chef);


        // Customer entry
        Customer customer = new Customer("John Doe");

        // Create an order item
        OrderItem orderItem = new OrderItem("1", pizza,2 );
        Order order = new Order("1",table, waiter);
        order.addOrderItem(order.getId(), orderItem);
        orderItem.addObserver(customer);

        // change state of the order user will get notified
        orderItem.getState().prepare(orderItem);
        orderItem.getState().serve(orderItem);










    }
}
