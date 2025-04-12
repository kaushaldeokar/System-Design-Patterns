package products;

public class Car extends Vehicle {

    public Car(Integer id,String number){
        super(id,number,VehicleType.CAR);
    }

    @Override
    public double price() {
        return super.price();
    }
}
