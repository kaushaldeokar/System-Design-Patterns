import expense.Split;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Splitwise splitwise = new Splitwise();

        splitwise.userController.createUser(1L, "Alice");
        splitwise.userController.createUser(2L, "Bob");


        Split split1 = new Split(splitwise.userController.users.get(1), 50.0);
        List<Split> splits = List.of(split1);
        //create Expense
        splitwise.expenseController.createExpense(1L, "Lunch", 100.0, splits, expense.SplitType.EQUAL, splitwise.userController.users.get(0));

        // Print balance sheet for Alice
        System.out.println("Balance Sheet for Alice:");
        System.out.println("Total Get Back: " + splitwise.userController.users.get(0).balanceSheet.totalGetBack);
        System.out.println("Total Owe: " + splitwise.userController.users.get(0).balanceSheet.totalOwe);
        System.out.println("Balance with Bob: " + Double.parseDouble(String.valueOf(splitwise.userController.users.get(0).balanceSheet.balance.get(splitwise.userController.users.get(1)).amountToReceive-splitwise.userController.users.get(0).balanceSheet.balance.get(splitwise.userController.users.get(1)).amountOwe)));


        Split split2 = new Split(splitwise.userController.users.get(0), 50.0);
        List<Split> splits2 = List.of(split2);
        //create Expense
        splitwise.expenseController.createExpense(1L, "Lunch", 100.0, splits2, expense.SplitType.EQUAL, splitwise.userController.users.get(1));

        // Print balance sheet for Alice
        System.out.println("Balance Sheet for Alice:");
        System.out.println("Total Get Back: " + splitwise.userController.users.get(0).balanceSheet.totalGetBack);
        System.out.println("Total Owe: " + splitwise.userController.users.get(0).balanceSheet.totalOwe);
        System.out.println("Balance with Bob: " + Double.parseDouble(String.valueOf(splitwise.userController.users.get(0).balanceSheet.balance.get(splitwise.userController.users.get(1)).amountToReceive-splitwise.userController.users.get(0).balanceSheet.balance.get(splitwise.userController.users.get(1)).amountOwe)));




    }
}


