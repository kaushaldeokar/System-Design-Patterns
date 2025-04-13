package vendingMachine.States.impl;

import vendingMachine.Coin;
import vendingMachine.States.State;
import vendingMachine.VendingMachine;
import vendingMachine.inventory.Item;

import java.util.List;

public class HasMoneyState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        System.out.println("Please proceed with inserting the coin");
    }

    @Override
    public void insertCoin(VendingMachine machine , Coin coin) throws Exception{
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }


    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        List<Coin>coins = machine.getCoinList();
        machine.setVendingMachineState(new IdleState(machine));
        return coins;
    }


    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }


}
