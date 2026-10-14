package model;

import enums.ItemType;
import state.AvailableState;
import state.ItemState;

import java.util.List;
import java.util.Objects;

public class LibraryItemCopy {

    private String id;
    private LibraryItem libraryItem;
    private ItemState itemState;

    // --- Constructors ---

    public LibraryItemCopy() {} // no-arg, for frameworks (JPA/Jackson)

    public LibraryItemCopy(String id, LibraryItem libraryItem) {
        this.id = id;
        this.libraryItem = libraryItem;
        this.itemState = new AvailableState(); // copies always start available
    }

    // --- Getters ---

    public String getId() {
        return id;
    }

    public LibraryItem getLibraryItem() {
        return libraryItem;
    }

    public ItemState getItemState() {
        return itemState;
    }

    // --- Setters ---

    public void setId(String id) {
        this.id = id;
    }

    public void setLibraryItem(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }

    public void setItemState(ItemState itemState) {
        this.itemState = Objects.requireNonNull(itemState, "itemState");
    }

    // --- State delegation ---

    /** Is this copy currently available to borrow? */
    public boolean isAvailable() {
        return itemState.getBookState() == enums.BookState.AVAILABLE;
    }

    /** Checks out this copy to a member. */
    public void checkout(Member member) {
        itemState.checkOutItem(this, member);
    }

    /** Returns this copy to the library. */
    public void returnItem(Member member) {
        itemState.returnItem(this,member);
    }

    /** Places a hold on this copy for a member. */
    public void placeHold(Member member) {
        itemState.holdItem(this, member);
    }

    public List<LibraryItemCopy> getAvailableCopies(LibraryItem item) {
        return item.getCopies().stream()
                .filter(LibraryItemCopy::isAvailable)
                .toList();
    }

    // --- Convenience ---

    /** Shortcut to the parent item's title, useful for logging. */
    public String getTitle() {
        return libraryItem != null ? libraryItem.getTitle() : null;
    }

    /** True if this copy belongs to the given parent item. */
    public boolean belongsTo(LibraryItem item) {
        return libraryItem != null && libraryItem.equals(item);
    }

    // --- Object contract ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryItemCopy)) return false;
        return Objects.equals(id, ((LibraryItemCopy) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LibraryItemCopy{" +
                "id=" + id +
                ", title='" + getTitle() + '\'' +
                ", state=" + itemState.getClass().getSimpleName() +
                '}';
    }
}