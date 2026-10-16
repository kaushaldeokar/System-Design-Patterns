package model;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private String id;
    private String name;
    private Menu menu;
    private final Map<String,Staff> staff = new HashMap<>();
    private final Map<String,Table> tables = new HashMap<>();


    public Restaurant(String id,String name) {
        this.name = name;
        this.menu = new Menu();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Map<String, Staff> getStaff() {
        return staff;
    }

    public Map<String, Table> getTables() {
        return tables;
    }

    public void addTable(String id, Table table) {
        tables.put(id, table);
    }

    public void addStaff(String id, Staff staffMember) {
        staff.put(id, staffMember);
    }




}
