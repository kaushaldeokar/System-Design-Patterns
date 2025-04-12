import inventory.InventoryFactory;
import inventory.VehicleInventory;
import products.Vehicle;
import products.VehicleType;
import reservation.ReservationManager;

import java.util.List;

public class Store {
    Integer storeId;
    InventoryFactory inventoryFactory;
    ReservationManager reservationManager;
    Location location;

    public void addVehicles(Vehicle vehicle){
        VehicleInventory vehicleInventory = inventoryFactory.vehicleTypeVehicleInventoryHashMap.get(vehicle.vehicleType);
        vehicleInventory.addVehicle(vehicle);
    }

    public void addAllVehicles(List<Vehicle>vehicles){
        for( Vehicle vehicle:vehicles){
            VehicleInventory vehicleInventory = inventoryFactory.vehicleTypeVehicleInventoryHashMap.get(vehicle.vehicleType);
            vehicleInventory.addVehicle(vehicle);
        }
    }

    public Store(Integer storeId){
        this.storeId=storeId;
        inventoryFactory = new InventoryFactory();
        reservationManager = new ReservationManager();
        this.location = null;
    }

    public List<Vehicle>getAllVehicles(VehicleType vehicleType){
        VehicleInventory vehicleInventory = inventoryFactory.vehicleTypeVehicleInventoryHashMap.get(vehicleType);
        return vehicleInventory.getAllVehicle();
    }

}
