package inventory;

import products.VehicleType;

import java.util.HashMap;

public class InventoryFactory {
    static HashMap<VehicleType, VehicleInventory> vehicleTypeVehicleInventoryHashMap = new HashMap<>();


    static {
        vehicleTypeVehicleInventoryHashMap.put(VehicleType.CAR,new CarInventory());
        vehicleTypeVehicleInventoryHashMap.put(VehicleType.BIKE, new BikeInventory());
    }

}
