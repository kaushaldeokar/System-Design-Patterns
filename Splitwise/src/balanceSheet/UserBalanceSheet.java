package balanceSheet;

import user.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserBalanceSheet {
    public Map<User,Balance> balance ;
    public Double totalOwe;
    public Double totalGetBack;

    // constructor
    public UserBalanceSheet() {
        this.totalOwe = 0.0;
        this.totalGetBack = 0.0;
        this.balance = new ConcurrentHashMap<>();
    }



}
