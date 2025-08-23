package parkingSpot;

import parkingSpot.spotManager.FourWheelerManager;
import parkingSpot.spotManager.ParkingSpotManager;
import parkingSpot.spotManager.TwoWheelerManager;
import vehicle.VehicleType;
import java.util.HashMap;

public class ParkingSpotFactory {
    public HashMap<VehicleType, ParkingSpotManager>factoryManager;
    public ParkingSpotFactory(){
        this.factoryManager = new HashMap<>();
        this.factoryManager.put(VehicleType.TWO_WHEELER,new TwoWheelerManager());
        this.factoryManager.put(VehicleType.FOUR_WHEELER,new FourWheelerManager());
    }
}
