package Group;

import expense.Expense;
import user.User;

import java.util.List;

public class Group {
    Long groupId;
    String groupName;
    List<User> users;
    List<Expense> expenses;

    public Group(Long groupId, String groupName, List<User> users) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.users = users;
    }
}
