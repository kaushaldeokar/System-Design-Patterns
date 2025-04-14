import atm.AtmMachine;

public class Main {
    public static void main(String[] args) throws Exception{


        AtmMachine atmMachine = new AtmMachine();

        // now input card //
        atmMachine.machineState.clickOnInsertCardButton(atmMachine);

        // giving amount to withdraw
        atmMachine.machineState.clickOnInputMoneyRequired(atmMachine,5000);

        //process the withdrawal
        atmMachine.machineState.processWithdrawal(atmMachine);


    }
}