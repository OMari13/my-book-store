package ru.itsjava.projectHW.servicesHW;

import ru.itsjava.projectHW.domainHW.Client;
import ru.itsjava.projectHW.domainHW.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО: ");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>()); //клиент с именем но без книг

        List<Course> courseList = new ArrayList<>(); //книги в наличии
        courseList.add(new Course("Java_Basic", "Нежинский Виталий"));
        courseList.add(new Course("Java_java", "Иванов Иван"));


        CourseService courseService = new CourseServiceImpl(courseList); //книги в магазине

        ClientService clientService =
                new ClientServiceImpl(client, scanner, courseService); //продавец

        MenuService menuService = new MenuServiceImpl(clientService, scanner); //меню

        menuService.menu();

    }
}
