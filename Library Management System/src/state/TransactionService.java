package state;

import model.LibraryItemCopy;
import model.Loan;
import model.Member;

public class TransactionService {
    public static TransactionService INSTANCE = new TransactionService();

    // private constructor to prevent instantiation
    private TransactionService() {}

    public static TransactionService getInstance() {
        return INSTANCE;
    }

    public void checkOutItem(LibraryItemCopy itemCopy, Member member) {
        // Implement logic for checking out the item create loan on the itemCopy and member
        Loan loan = new Loan(member, itemCopy);
        member.addLoan(loan);
    }

    public void returnItem(LibraryItemCopy itemCopy, Member member) {
        // Implement logic for returning the item
        // Remove the loan from the member's list of loans
        Loan loan = member.getLoanByItemCopy(itemCopy);
        if (loan != null) {
            member.removeLoan(loan);
        }
        if(itemCopy.getLibraryItem().hasObservers()){
            itemCopy.getLibraryItem().notifyObservers();
        }

    }

}
