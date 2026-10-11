package expense;

import user.User;

import java.util.List;

public class Expense {
    Long id;
    String description;
    Double amount;
    User paidBy;
    SplitType splitType;
    List<Split>splits;

    //constructor
    public Expense(Long id, String description, Double amount, User paidBy, SplitType splitType, List<Split> splits) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.splits = splits;
    }
}
