package products;

public class Vehicle {
    public Integer vehicleId;
    public String vehicleNumber;
    public VehicleType vehicleType;

    public Vehicle(Integer vehicleId,String vehicleNumber,VehicleType vehicleType){
        this.vehicleId=vehicleId;
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
    }

    public double price(){
        return 100.0;
    }
}
