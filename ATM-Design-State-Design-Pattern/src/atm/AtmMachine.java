package atm;

import atm.states.IdleState;
import atm.states.State;

public class AtmMachine {

    public State machineState;
    public Integer inputMoney;

    public Integer atmBalance;
    public Integer numberOf2000Notes;
    public Integer numberOf1000Notes;
    public Integer numberOf500Notes;


    public AtmMachine(){
        this.machineState= new IdleState();
        this.atmBalance=35000;
        this.numberOf2000Notes=10;
        this.numberOf500Notes=10;
        this.numberOf1000Notes=10;
    }

    public void deduct500Notes(int count){
        numberOf500Notes-=count;
    }

    public void deduct1000Notes(int count){
        numberOf1000Notes-=count;
    }


    public void deduct2000Notes(int count){
        numberOf2000Notes-=count;
    }








}
