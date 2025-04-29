package day6.iterator;

import day4.composite.Directory;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection{
    private final List<Book> books  = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new LibraryIterator(books);
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }
}
