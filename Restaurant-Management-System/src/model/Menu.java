package model;

import java.util.HashMap;
import java.util.Map;
import model.MenuItem;

public class Menu {
    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public void addMenuItem(String id,MenuItem item) {
        menuItems.put(id, item);
    }

    public void removeMenuItem(String id) {
        menuItems.remove(id);
    }

}
