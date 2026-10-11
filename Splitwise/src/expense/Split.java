package expense;

import user.User;

public class Split {
    public User user;
    public double amount;

    //constructor
    public Split(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }
}
