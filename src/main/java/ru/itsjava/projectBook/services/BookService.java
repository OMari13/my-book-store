package ru.itsjava.projectBook.services;

import ru.itsjava.projectBook.domain.Book;

public interface BookService {
    Book takeBookByName(String name);
    void putBook(Book book);
    boolean hasBook(String name);
    void printBooks();


}
