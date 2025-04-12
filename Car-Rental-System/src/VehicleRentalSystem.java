import reservation.User;


import java.util.List;

public class VehicleRentalSystem {
    List<Store>stores;
    List<User>users;


    public VehicleRentalSystem(List<Store>stores,List<User>users){
        this.stores=stores;
        this.users=users;
    }

    public Store getStoreByLocation(Location location){
        //for now just returning the first one//
        return stores.getFirst();
    }

    public void addUsers(User user){
        users.add(user);
    }

    public void addStores(Store store){
        stores.add(store);
    }



    //similarly crud - remove stores operations can be considered here//
}
