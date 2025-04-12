package inventory;

import products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarInventory implements VehicleInventory {


    public List<Vehicle> vehicleList;

    public CarInventory(){
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

