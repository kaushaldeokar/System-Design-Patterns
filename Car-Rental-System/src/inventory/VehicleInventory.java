package inventory;

import products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public interface VehicleInventory {
    public void addVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicle();
}
