package ru.itsjava.projectBook.services;

import ru.itsjava.projectBook.domain.Book;
import ru.itsjava.projectBook.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО ");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Философия_Java", "Брюс_Эккель"));
        bookList.add(new Book("Чистый_код", "Роберт_Мартин"));


        BookService bookService = new BookServiceImpl(bookList);

        ClientService clientService = new ClientServiceImpl(client, scanner, bookService);


        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}
