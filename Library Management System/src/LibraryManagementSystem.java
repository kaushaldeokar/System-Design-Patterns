import enums.ItemType;
import model.LibraryItem;
import model.LibraryItemCopy;
import model.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LibraryManagementSystem {
    public static LibraryManagementSystem INSTANCE = new LibraryManagementSystem();

    private final Map<Long, LibraryItem> libraryItems = new ConcurrentHashMap<>();
    private final Map<String, LibraryItemCopy> libraryItemCopies = new ConcurrentHashMap<>();
    private final Map<Long, Member> members = new ConcurrentHashMap<>();

    public static LibraryManagementSystem getInstance() {
        return INSTANCE;
    }

    // private constructor to prevent instantiation
    private LibraryManagementSystem() {}

    public Map<Long, LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public Map<String, LibraryItemCopy> getLibraryItemCopies() {
        return libraryItemCopies;
    }

    public Map<Long, Member> getMembers() {
        return members;
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void addLibraryItem(LibraryItem item, int numCopies) {
        libraryItems.put(item.getId(), item);
        for (int i = 0; i < numCopies; i++) {
            LibraryItemCopy copy = new LibraryItemCopy(item.getId() + "-cp-"+(i+1), item); // Unique ID for copy
            libraryItemCopies.put(copy.getId(), copy);
            item.getCopies().add(copy);
        }
    }

    public void checkoutItemCopy(String copyId, Long memberId) {
        LibraryItemCopy copy = libraryItemCopies.get(copyId);
        Member member = members.get(memberId);
        if (copy != null) {
            copy.getItemState().checkOutItem(copy, member);
        } else {
            throw new IllegalArgumentException("Copy ID not found.");
        }
    }

    public void returnItemCopy(String copyId,Long memberId) {
        LibraryItemCopy copy = libraryItemCopies.get(copyId);
        Member member = members.get(memberId);
        if (copy != null) {
            copy.getItemState().returnItem(copy,member);
        } else {
            throw new IllegalArgumentException("Copy ID not found.");
        }
    }

    public void placeHoldOnItemCopy(String copyId, Long memberId) {
        LibraryItemCopy copy = libraryItemCopies.get(copyId);
        Member member = members.get(memberId);
        if (copy != null) {
            copy.getItemState().holdItem(copy, member);
        } else {
            throw new IllegalArgumentException("Copy ID not found.");
        }
    }
}
