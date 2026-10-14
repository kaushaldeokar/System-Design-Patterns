package state;

import model.LibraryItemCopy;
import model.Member;
import enums.BookState;

public class AvailableState implements ItemState {

    @Override
    public void checkOutItem(LibraryItemCopy itemCopy, Member member) {
        // Implement logic for checking out the item
        System.out.println("Item checked out by member: " + member.getName());
        // Change the state of the item to CheckedOutState
        itemCopy.setItemState(new CheckedOutState());
    }

    @Override
    public void returnItem(LibraryItemCopy itemCopy, Member member) {
        // Item is already available, so returning it doesn't change the state
        System.out.println("Item is already available. No action taken.");
    }

    @Override
    public void holdItem(LibraryItemCopy itemCopy, Member member) {
        // Implement logic for holding the item
        System.out.println("Item held by member: " + member.getName());
        // Change the state of the item to OnHoldState
        itemCopy.setItemState(new OnHoldState());
    }

    @Override
    public BookState getBookState() {
        return BookState.AVAILABLE;
    }
}
