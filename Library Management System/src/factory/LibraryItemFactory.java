package factory;

import enums.ItemType;
import model.Book;
import model.LibraryItem;
import model.Magazine;

public class LibraryItemFactory {
    public static LibraryItem createItem(ItemType type, Long id, String title, String author) {
        return switch (type) {
            case BOOK -> new Book(id, title, author);
            case MAGAZINE -> new Magazine(id, title, author); // Author might be publisher here
            default -> throw new IllegalArgumentException("Unknown item type.");
        };
    }
}
