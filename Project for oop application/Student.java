
public class Student extends LibraryUser{
   private String department;

   public void borrowBook(Book book) {

       if(book.getAuthor() == null) {
           book.setIsAvailable(false);
       }

       if(!book.getIsAvailable()) {
           System.out.println("Book is not available");
       }else{
           System.out.println(book.getTitle() + " borrowed!");
       }


   }

   @Override
   void accessLibrary() {
       System.out.println("You are accessing library");
   }

   public static void main(String[] args) {
       Student student = new Student();
       Book book = new Book("Book 1", "My first book", true);
       Book book2 = new Book("Book 2", "My second book", true);

       student.accessLibrary();

       student.borrowBook(book);
   }

}
