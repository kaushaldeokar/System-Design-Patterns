package balanceSheet;

import expense.Split;
import user.User;

import java.util.List;

public class BalanceSheetController {



    public void updateUserExpenseBalanceSheet(User paidByUser, List<Split>splitDetails, Double expenseAmount){

        for(Split split: splitDetails){
            User paidForUser = split.user;
            Double amount = split.amount;

            // update the balance sheet for the user who paid
            Balance balanceForPaidByUser = paidByUser.balanceSheet.balance.getOrDefault(paidForUser , new Balance());
            balanceForPaidByUser.amountToReceive += amount;
            paidByUser.balanceSheet.totalGetBack += amount;
            paidByUser.balanceSheet.balance.put(paidForUser, balanceForPaidByUser);


            // update the balance sheet for the user who paid for
            Balance balanceForPaidForUser = paidForUser.balanceSheet.balance.getOrDefault(paidByUser, new Balance());
            balanceForPaidForUser.amountOwe += amount;
            paidForUser.balanceSheet.totalOwe += amount;
            paidForUser.balanceSheet.balance.put(paidByUser, balanceForPaidForUser);
        }
    }
}
