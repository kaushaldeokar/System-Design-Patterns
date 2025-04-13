package vendingMachine.inventory;

import products.VehicleType;

import java.util.HashMap;

public class InventoryFactory {
    public  HashMap<VehicleType, VehicleInventory> vehicleTypeVehicleInventoryHashMap;

    public InventoryFactory(){
        this.vehicleTypeVehicleInventoryHashMap  = new HashMap<>();
        vehicleTypeVehicleInventoryHashMap.put(VehicleType.CAR,new CarInventory());
        vehicleTypeVehicleInventoryHashMap.put(VehicleType.BIKE, new BikeInventory());
    }

}
