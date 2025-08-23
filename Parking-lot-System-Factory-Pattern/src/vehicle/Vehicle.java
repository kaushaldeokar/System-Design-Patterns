package vehicle;

public class Vehicle {
    public Integer vehicleId;
    public VehicleType vehicleType;
    public String vehicleNumber;

    public Vehicle(Integer vehicleId,VehicleType vehicleType, String vehicleNumber){
        this.vehicleId=vehicleId;
        this.vehicleType=vehicleType;
        this.vehicleNumber=vehicleNumber;
    }
}
