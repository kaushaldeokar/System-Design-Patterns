package state;

import model.LibraryItemCopy;
import model.Member;
import enums.BookState;

public class CheckedOutState implements ItemState {

    @Override
    public void checkOutItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Item is already checked out.");
    }

    @Override
    public void returnItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Returning the item.");
        itemCopy.setItemState(new AvailableState());
    }

    @Override
    public void holdItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Cannot place a hold on a checked out item.");
    }

    @Override
    public BookState getBookState() {
        return BookState.CHECKED_OUT;
    }
}
