package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {

    private Long id;
    private String name;
    private String phoneNumber;
    private final List<Loan> loans = new ArrayList<>();

    // --- Constructors ---

    public Member() {} // no-arg, for frameworks (JPA/Jackson) and subclass chains

    public Member(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // --- Getters ---

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // --- Setters ---

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // --- Loan management ---

    /**
     * Adds a loan to this member.
     * @return true if added, false if already present.
     */
    public boolean addLoan(Loan loan) {
        Objects.requireNonNull(loan, "loan");
        if (loans.contains(loan)) {
            return false;
        }
        return loans.add(loan);
    }

    /**
     * Removes a loan from this member.
     */
    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }

    public boolean hasLoans() {
        return !loans.isEmpty();
    }

    public boolean hasLoan(Loan loan) {
        return loans.contains(loan);
    }

    public int loanCount() {
        return loans.size();
    }

    /** Immutable snapshot — callers cannot mutate the internal list. */
    public List<Loan> getLoans() {
        return List.copyOf(loans);
    }

    public Loan getLoanByItemCopy(LibraryItemCopy itemCopy) {
        for (Loan loan : loans) {
            if (loan.getLibraryItemCopy().equals(itemCopy)) {
                return loan;
            }
        }
        return null;
    }

    public void clearLoans() {
        loans.clear();
    }

    // --- Notification (Observer pattern) ---

    /**
     * Called by LibraryItem when an item becomes available.
     */
    public void notify(LibraryItem libraryItem) {
        if (libraryItem == null) return;
        System.out.println(
                "Sending notification to " + name +
                        " for the item: " + libraryItem.getTitle() +
                        " on phone number: " + phoneNumber
        );
    }

    // --- Object contract ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        return Objects.equals(id, ((Member) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", loans=" + loans.size() +
                '}';
    }
}