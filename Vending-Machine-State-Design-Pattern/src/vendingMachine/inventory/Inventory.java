package vendingMachine.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public List<Shelf> shelfList;

    public Inventory(){
        shelfList = new ArrayList<>();
    }

    public List<Shelf>getShelfList(){
        return shelfList;
    }



}
