package user;

import balanceSheet.BalanceSheetController;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    public List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public User createUser(Long id, String name) {
        User user = new User(id, name);
        users.add(user);
        return user;
    }
}
