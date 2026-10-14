package state;

import model.LibraryItemCopy;
import model.Member;
import enums.BookState;

public class OnHoldState implements ItemState {

    @Override
    public void checkOutItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Item is on hold. Cannot check out.");
    }

    @Override
    public void returnItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Returning item from on hold state.");
        // Transition to AvailableState or CheckedOutState based on business logic
        itemCopy.setItemState(new AvailableState());
    }

    @Override
    public void holdItem(LibraryItemCopy itemCopy, Member member) {
        System.out.println("Item is already on hold.");
    }

    @Override
    public BookState getBookState() {
        return BookState.ON_HOLD;
    }
}
