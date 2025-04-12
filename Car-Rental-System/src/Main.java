import inventory.InventoryFactory;
import payment.Bill;
import payment.PaymentType;
import products.Bike;
import products.Car;
import products.Vehicle;
import products.VehicleType;
import reservation.Ticket;
import reservation.User;

import java.util.*;

public class Main {

    public static List<User> userList;
    public static List<Store> stores;
    public static List<Vehicle>vehicles;
    public static VehicleRentalSystem vehicleRentalSystem;



    public static void main(String[] args) {

        init();


         //0. User comes
        User user = userList.get(0);

        //1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = vehicleRentalSystem.getStoreByLocation(location);


        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getAllVehicles(VehicleType.CAR);

        //generating ticket
        Ticket ticket = new Ticket(1,user,storeVehicles.getFirst(),2);

        // generate Bill
        Bill bill = new Bill(ticket, PaymentType.CARD);

        System.out.println(bill.calAmountAndProcess());

        //vehicle came //
        store.reservationManager.removeTicket(ticket);


    }

    public static void init(){

        userList= addUsers();
        stores = new ArrayList<>();
        // initialising store //
        vehicles = addVehicles();
        Store store = new Store(1);
        store.addAllVehicles(vehicles);

        stores.add(store);

        vehicleRentalSystem = new VehicleRentalSystem(stores,userList);
    }

    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car(1,"MP68-1199");
        Vehicle vehicle2 = new Car(2,"MP68-7799");
        Vehicle bike1 = new Bike(3,"MP68-xx99");
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(bike1);
        return vehicles;
    }


    public static List<User> addUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User(1,"lisc-01");
        users.add(user1);
        return users;
    }



}