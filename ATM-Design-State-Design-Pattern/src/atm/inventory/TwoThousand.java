package atm.inventory;

import atm.AtmMachine;

public class TwoThousand extends MoneyProcessor{

    public TwoThousand(MoneyProcessor moneyProcessor){
        super(moneyProcessor);
    }

    @Override
    public void processMoney(Integer inputMoney, AtmMachine atmMachine) {

        //check if possible with Two thousand otherwise pass two next process

        int required =  inputMoney/2000;
        int balance = inputMoney%2000;

        if(required <= atmMachine.numberOf2000Notes) {
            System.out.println("Used 2000 notes :"+required);
            atmMachine.deduct2000Notes(required);
        }
        else {
            atmMachine.deduct2000Notes(atmMachine.numberOf2000Notes);
            balance = balance + (required-atmMachine.numberOf2000Notes) * 2000;
        }


        if(balance!=0)super.processMoney(balance,atmMachine);
    }
}
