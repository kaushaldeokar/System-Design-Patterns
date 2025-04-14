package atm.inventory;

import atm.AtmMachine;

public class MoneyProcessor {

    public static Integer TWO_THOUSAND = 2;
    public static Integer ONE_THOUSAND = 3;
    public static Integer FIVE_HUNDRED = 2;

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
