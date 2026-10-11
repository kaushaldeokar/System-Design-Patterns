package user;

import balanceSheet.UserBalanceSheet;

public class User {
    public Long id;
    public String name;
    public UserBalanceSheet balanceSheet;

    //constructor
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
        this.balanceSheet = new UserBalanceSheet();
    }
}
