package atm.inventory;

import atm.AtmMachine;

public class OneThousand extends MoneyProcessor{

    public OneThousand(MoneyProcessor moneyProcessor){
        super(moneyProcessor);
    }

    @Override
    public void processMoney(Integer inputMoney, AtmMachine atmMachine) {

        //check if possible with Two thousand otherwise pass two next process

        int required =  inputMoney/1000;
        int balance = inputMoney%1000;

        if(required <= atmMachine.numberOf1000Notes) {

            System.out.println("Used 1000 notes :"+required);
            atmMachine.deduct1000Notes(required);


        }
        else {
            atmMachine.deduct2000Notes(atmMachine.numberOf1000Notes);
            balance = balance + (required-atmMachine.numberOf1000Notes) * 1000;
        }


        if(balance!=0)super.processMoney(balance,atmMachine);
    }
}

