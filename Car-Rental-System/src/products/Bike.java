package products;

public class Bike extends Vehicle {


    public Bike(Integer id,String number){
        super(id,number,VehicleType.BIKE);
    }

    @Override
    public double price() {
        return 50.0;
    }
}
