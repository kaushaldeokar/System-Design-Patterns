package state;

import model.LibraryItemCopy;
import model.Member;
import enums.BookState;

public interface ItemState {

    void checkOutItem(LibraryItemCopy itemCopy, Member member);
    void returnItem(LibraryItemCopy itemCopy, Member member);
    void holdItem(LibraryItemCopy itemCopy, Member member);
    BookState getBookState();

}
