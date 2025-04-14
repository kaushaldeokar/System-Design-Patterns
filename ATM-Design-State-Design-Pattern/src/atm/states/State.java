package atm.states;

import atm.AtmMachine;

public interface State {

    public void clickOnInsertCardButton(AtmMachine atmMachine) throws Exception;

    public void clickOnInputMoneyRequired(AtmMachine atmMachine,Integer withDrawAmount)throws Exception;

    public void processWithdrawal(AtmMachine atmMachine)throws Exception;

    public void dispenseMoney(AtmMachine atmMachine)throws Exception;
}
