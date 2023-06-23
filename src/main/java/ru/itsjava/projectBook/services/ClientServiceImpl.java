package ru.itsjava.projectBook.services;

import ru.itsjava.projectBook.domain.Book;
import ru.itsjava.projectBook.domain.Client;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final BookService bookService;

    @Override
    public void buyBook() {
        System.out.println("Введите название книги");
        String title = scanner.next();
        if (bookService.hasBook(title)) {
            System.out.println("Покупаем книгу ...");
            bookService.takeBookByName(title);
            System.out.println("Купили книжку" + title);
        } else {
            System.out.println("Не смогли книжку... Такой книжки нет :(");
        }

    }

    @Override
    public void putBook() {

        System.out.println("Введите название книги");
        String title = scanner.next();

        System.out.println("Введите автора книги");
        String author = scanner.next();

        Book book = new Book(title, author);
        bookService.putBook(book);

    }

    @Override
    public void printBooks() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши книги: ");
        bookService.printBooks();
    }
}
