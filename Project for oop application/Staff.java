
public class Staff extends LibraryUser {
    public static void manageBook(Book body, Boolean add) {
        if(add) {
            System.out.println("Book is added");
        }
    }

    public void removeBook(Book body, Boolean isAvailable) {
        if(isAvailable) {
            System.out.println("Book is removed");
        }
    }

    @Override
    void accessLibrary() {
        System.out.println("You are accessing library");
    }

    void giveAccess() {
        accessLibrary();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "My first book", true);
        Book book2 = new Book("Book 2", "My second book", true);

        Student student = new Student();
        Staff staff = new Staff();

        staff.giveAccess();

        manageBook(book1, true);

    }
}
