import enums.ItemType;
import factory.LibraryItemFactory;
import model.LibraryItem;
import model.Member;

import java.io.ObjectInputStream;

public class LibraryManagementSystemDemo {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = LibraryManagementSystem.getInstance();

        LibraryItem book1 = LibraryItemFactory.createItem(ItemType.BOOK, 1L, "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine1 = LibraryItemFactory.createItem(ItemType.MAGAZINE, 2L, "National Geographic", "Various Authors");

        libraryManagementSystem.addLibraryItem(book1, 5);
        libraryManagementSystem.addLibraryItem(magazine1, 3);

        libraryManagementSystem.getLibraryItems().forEach((id, item) -> {
            System.out.println("Item ID: " + id + ", Title: " + item.getTitle() + ", Author: " + item.getAuthor());
            item.getCopies().forEach(copy -> {
                System.out.println("  Copy ID: " + copy.getId() + ", Available: " + copy.isAvailable());
            });
        });

        System.out.println("--------------------------------------------------");

        Member member1 = new Member(1L, "John Doe", "555-1234");
        libraryManagementSystem.addMember(member1);


        // Checkout a copy of the book
        String copyIdToCheckout = book1.getCopies().get(0).getId();
        String copyIdToCheckout2 = magazine1.getCopies().get(1).getId();
        libraryManagementSystem.checkoutItemCopy(copyIdToCheckout, member1.getId());
        libraryManagementSystem.checkoutItemCopy(copyIdToCheckout2, member1.getId());

        //check the states
        libraryManagementSystem.getLibraryItems().forEach((id, item) -> {
            System.out.println("Item ID: " + id + ", Title: " + item.getTitle() + ", Author: " + item.getAuthor());
            item.getCopies().forEach(copy -> {
                System.out.println("  Copy ID: " + copy.getId() + ", Available: " + copy.isAvailable());
            });
        });

        System.out.println("--------------------------------------------------");

        // Return the copy of the book
        libraryManagementSystem.returnItemCopy(copyIdToCheckout, member1.getId());

        //check the states
        libraryManagementSystem.getLibraryItems().forEach((id, item) -> {
            System.out.println("Item ID: " + id + ", Title: " + item.getTitle() + ", Author: " + item.getAuthor());
            item.getCopies().forEach(copy -> {
                System.out.println("  Copy ID: " + copy.getId() + ", Available: " + copy.isAvailable());
            });
        });


        System.out.println("--------------------------------------------------");

        //
        LibraryItem hobbit = LibraryItemFactory.createItem(ItemType.BOOK, 3L, "Hobbit", "F. Scott Fitzgerald");
        libraryManagementSystem.addLibraryItem(hobbit, 1);

        // Members Alice and BOB tries to get copied at same time
        Member alice = new Member(2L, "Alice", "555-5678");
        Member bob = new Member(3L, "Bob", "555-8765");
        libraryManagementSystem.addMember(alice);
        libraryManagementSystem.addMember(bob);

        String hobbitCopyId = hobbit.getCopies().get(0).getId();
        libraryManagementSystem.checkoutItemCopy(hobbitCopyId, alice.getId());
        libraryManagementSystem.checkoutItemCopy(hobbitCopyId, bob.getId());

        // Bob Places a hold on the copy
        libraryManagementSystem.getLibraryItemCopies().get(hobbitCopyId).placeHold(bob);


        // Alice returns the copy
        libraryManagementSystem.returnItemCopy(hobbitCopyId, alice.getId());




    }
}
