package atm.inventory;

import atm.AtmMachine;

public class MoneyProcessor {


    public MoneyProcessor nextMoneyProcessor;

    public MoneyProcessor(MoneyProcessor moneyProcessor){
        this.nextMoneyProcessor=moneyProcessor;
    }

    public void processMoney(Integer inputMoney, AtmMachine atmMachine){
        if(nextMoneyProcessor!=null){
            nextMoneyProcessor.processMoney(inputMoney,atmMachine);
        }
    }


}
