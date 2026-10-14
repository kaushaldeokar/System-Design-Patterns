package state;

import model.LibraryItemCopy;
import model.Member;
import enums.BookState;

public class CheckedOutState implements ItemState {

    TransactionService transactionService = TransactionService.getInstance();

    @Override
    public void checkOutItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Item is already checked out.");
    }

    @Override
    public void returnItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Returning the item.");
        transactionService.returnItem(itemCopy, member);
        if(itemCopy.getLibraryItem().hasObservers()) {
            itemCopy.setItemState(new OnHoldState());
        } else {
            itemCopy.setItemState(new AvailableState());
        }
    }

    @Override
    public void holdItem(LibraryItemCopy itemCopy, Member member) {
        itemCopy.getLibraryItem().addObserver(member);
        System.out.println("Member " + member.getName() + " has placed a hold on the item.");
    }

    @Override
    public BookState getBookState() {
        return BookState.CHECKED_OUT;
    }
}
