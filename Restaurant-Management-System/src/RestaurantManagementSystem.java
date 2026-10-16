import model.Restaurant;

import java.util.HashMap;

public class RestaurantManagementSystem {
    private final HashMap<String, Restaurant>Restaurants;

    public RestaurantManagementSystem() {
        Restaurants = new HashMap<>();
    }


    // method to add a restaurant
    public void addRestaurant(String id,Restaurant restaurant) {
        Restaurants.put(id, restaurant);
    }

    public Restaurant getRestaurant(String id) {
        return Restaurants.get(id);
    }







}
