public class Person {
    private String name;
    private int id;

    public static  void main(String[] args) {
        Student student = new Student();
        Book book = new Book("Book1", "My second Book", true);
        Staff staff = new Staff();
        staff.giveAccess();

        if(book.getIsAvailable()) {
            staff.removeBook(book, true);
        }else{
            System.out.println("Book is not available");
        }
    }
}


