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

    public Item getItemByCode(Integer code) throws Exception{

        for(Shelf shelf:shelfList){
            if(shelf.shelfCode.equals(code)){
                if(shelf.inventoryCount!=0){
                    return shelf.item;
                }else throw new Exception("inventory is 0");
            }
        }

        return null;

    }

    public void updateSoldOutItem(Integer code) throws Exception{

        for(Shelf shelf:shelfList){
            if(shelf.shelfCode.equals(code)){
                if(shelf.inventoryCount!=0){
                    shelf.inventoryCount-=1;
                }else throw new Exception("inventory is already 0");
            }
        }


    }



}
