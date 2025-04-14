package atm.states;

import atm.AtmMachine;
import atm.inventory.FiveHundred;
import atm.inventory.MoneyProcessor;
import atm.inventory.OneThousand;
import atm.inventory.TwoThousand;

public class ProcessingState implements State {

    public ProcessingState(){
        System.out.println("Atm is in processing state");
    }

    public void clickOnInsertCardButton(AtmMachine atmMachine) throws Exception{
        throw new Exception("ATM is in processing state");
    }

    public void clickOnInputMoneyRequired(AtmMachine atmMachine,Integer withDrawAmount)throws Exception{
        throw new Exception("ATM is in processing state");
    }

    public void processWithdrawal(AtmMachine atmMachine)throws Exception{

        MoneyProcessor moneyProcessor = new TwoThousand(new OneThousand(new FiveHundred(null)));

        moneyProcessor.processMoney(atmMachine.inputMoney,atmMachine);


    }

    public void dispenseMoney(AtmMachine atmMachine)throws Exception{

    }
}
