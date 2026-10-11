
import balanceSheet.BalanceSheetController;
import expense.ExpenseController;
import user.UserController;
import Group.GroupController;

public class Splitwise {

    UserController userController ;
    GroupController groupController;
    BalanceSheetController balanceSheetController;
    ExpenseController expenseController;

    //constructor
    public Splitwise() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
        expenseController = new ExpenseController(balanceSheetController);

    }

}
