package atm.states;

import atm.AtmMachine;

public class InputState implements State{

    public InputState(){
        System.out.println("ATM in input state : please Enter amount to withdraw");
    }

    public void clickOnInsertCardButton(AtmMachine atmMachine) throws Exception{
        return;
    }

    public void clickOnInputMoneyRequired(AtmMachine atmMachine,Integer withDrawAmount)throws Exception{
        System.out.println("Entered the withdraw  : "+withDrawAmount);
        atmMachine.machineState= new ProcessingState();
        atmMachine.inputMoney=withDrawAmount;
    }

    public void processWithdrawal(AtmMachine atmMachine)throws Exception{
        throw new Exception("Input in progress");
    }

    public void dispenseMoney(AtmMachine atmMachine)throws Exception{
        throw new Exception("Input in progress");
    }
}
