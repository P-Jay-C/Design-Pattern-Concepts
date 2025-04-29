package day6.iterator;

public class IteratorTest {
   public static void main(String[] args){
       Library library = new Library();

       library.addBook(new Book("Design Patterns"));
       library.addBook(new Book("Clean Code"));
       library.addBook(new Book("Refactoring"));

       Iterator iterator = library.createIterator();

       while(iterator.hasNext()){
           Book book = iterator.next();
           System.out.println("Book: " + book.getTitle());
       }
   }
}
