package parkingSpot;


import vehicle.Vehicle;

public class ParkingSpot {
    public Integer parkingSpotId;
    public Vehicle vehicle;
    public Boolean isEmpty;

    public ParkingSpot(Integer parkingSpotId){
        this.parkingSpotId=parkingSpotId;
        this.isEmpty=true;
    }

    public void parkVehicleAtSpot(Vehicle vehicle){
        this.vehicle=vehicle;
        this.isEmpty=false;
    }
}
