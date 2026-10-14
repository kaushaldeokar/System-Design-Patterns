package model;

public class Loan {
    private Member member;
    private LibraryItemCopy libraryItemCopy;

    public Loan(Member member, LibraryItemCopy libraryItemCopy) {
        this.member = member;
        this.libraryItemCopy = libraryItemCopy;
    }

    public Object getLibraryItemCopy() {
        return libraryItemCopy;
    }
}
