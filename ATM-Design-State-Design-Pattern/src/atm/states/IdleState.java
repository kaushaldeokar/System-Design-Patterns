package atm.states;

import atm.AtmMachine;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Machine is in Idle State ");
    }


    public void clickOnInsertCardButton(AtmMachine atmMachine) throws Exception{
        System.out.println("Card is taken Successfully");
        atmMachine.machineState= new InputState();
    }

    public void clickOnInputMoneyRequired(AtmMachine atmMachine,Integer withDrawAmount)throws Exception{
        throw new Exception("First Insert the card");
    }

    public void processWithdrawal(AtmMachine atmMachine)throws Exception{
        throw new Exception("First Insert the card");
    }


    public void dispenseMoney(AtmMachine atmMachine)throws Exception{
        throw new Exception("First Insert the card");
    }
}
