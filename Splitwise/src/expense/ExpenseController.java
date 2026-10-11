package expense;

import balanceSheet.*;
import user.User;

import java.util.List;


public class ExpenseController {


    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(Long expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser) {

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }





}
