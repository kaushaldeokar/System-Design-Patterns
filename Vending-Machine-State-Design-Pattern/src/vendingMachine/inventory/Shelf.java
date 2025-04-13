package vendingMachine.inventory;

public class Shelf {
    public Integer shelfCode ;
    public Item item;
    public Integer inventoryCount;

    public Shelf(Integer shelfCode, Item item , Integer inventoryCount){
        this.shelfCode=shelfCode;
        this.item=item;
        this.inventoryCount=inventoryCount;
    }
}
