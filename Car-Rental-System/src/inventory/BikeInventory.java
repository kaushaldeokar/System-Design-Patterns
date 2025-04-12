package inventory;


import products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class BikeInventory implements VehicleInventory {

    public List<Vehicle> vehicleList;

    public BikeInventory(){
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleList;
    }
}
