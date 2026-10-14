package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class LibraryItem {
    private Long id;
    private String title;
    private String author;

    // final = the list instance never changes; contents still mutate
    private final List<Member> observers = new ArrayList<>();

    protected List<LibraryItemCopy> copies = new ArrayList<>();

    // --- Constructors ---

    public LibraryItem(Long id, String title,String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // --- Getters ---

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // --- Setters ---

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public List<LibraryItemCopy> getCopies() {
        return copies;
    }

    public void setCopies(List<LibraryItemCopy> copies) {
        this.copies = copies;
    }

    public void addCopy(LibraryItemCopy copy) {
        this.copies.add(copy);
    }

    public void removeCopy(LibraryItemCopy copy) {
        this.copies.remove(copy);
    }

    // --- Observer registration ---

    /**
     * Registers a member as an observer.
     * @return true if the member was added, false if already registered.
     */
    public boolean addObserver(Member member) {
        Objects.requireNonNull(member, "member");
        if (observers.contains(member)) {
            return false; // already subscribed
        }
        observers.add(member);
        return true;
    }

    /**
     * Unregisters a member.
     * @return true if the member was removed, false if not subscribed.
     */
    public boolean removeObserver(Member member) {
        return observers.remove(member);
    }

    /** Removes all observers. */
    public void clearObservers() {
        observers.clear();
    }

    // --- Observer queries ---

    public boolean hasObservers() {
        return !observers.isEmpty();
    }

    public boolean isObserver(Member member) {
        return observers.contains(member);
    }

    public int observerCount() {
        return observers.size();
    }

    /**
     * Returns an immutable snapshot of the observers.
     * Prevents callers from mutating our internal list.
     */
    public List<Member> getObservers() {
        return List.copyOf(observers);
    }

    // --- Notification ---

    /**
     * Notifies all observers that this item is now available.
     * Called when a copy is returned and holds can be fulfilled.
     */
    public void notifyObservers() {
        // Iterate over a snapshot so an observer that removes itself
        // during notification doesn't cause ConcurrentModificationException.
        for (Member observer : List.copyOf(observers)) {
            observer.notify(this);
        }
    }

    /**
     * Notifies a specific observer (e.g. when their hold becomes available).
     * @return true if the member was an observer and got notified.
     */
    public boolean notifyObserver(Member member) {
        if (member != null && observers.contains(member)) {
            member.notify(this);
            return true;
        }
        return false;
    }

    // --- Object contract ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryItem)) return false;
        return Objects.equals(id, ((LibraryItem) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{id=" + id + ", title='" + title + "', observers=" + observers.size() + "}";
    }
}