package atm.inventory;

import atm.AtmMachine;

public class FiveHundred extends MoneyProcessor{

    public FiveHundred(MoneyProcessor moneyProcessor){
        super(moneyProcessor);
    }

    @Override
    public void processMoney(Integer inputMoney, AtmMachine atmMachine) {

        //check if possible with Two thousand otherwise pass two next process

        int required =  inputMoney/500;
        int balance = inputMoney%500;

        if(required <= atmMachine.numberOf500Notes) {
            System.out.println("Used 500 notes :"+required);
            atmMachine.deduct500Notes(required);
        }
        else {
            atmMachine.deduct500Notes(atmMachine.numberOf500Notes);
            balance = balance + (required-atmMachine.numberOf500Notes) * 500;
        }


        if(balance!=0)super.processMoney(balance,atmMachine);
    }
}

