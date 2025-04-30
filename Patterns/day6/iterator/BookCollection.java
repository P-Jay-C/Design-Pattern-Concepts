package day6.iterator;

public interface BookCollection {
    Iterator createIterator();
    void addBook(Book book);
}
