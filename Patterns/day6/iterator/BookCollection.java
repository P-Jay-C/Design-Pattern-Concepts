package day6.iterator;

public interface BookCollection {
    Iterator createIterator();
    public void addBook(Book book);
}
