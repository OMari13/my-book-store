package ru.itsjava.projectHW.servicesHW;

import ru.itsjava.projectHW.domainHW.Client;
import ru.itsjava.projectHW.domainHW.Course;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final CourseService courseService;

    @Override
    public void buyCourse() {
        System.out.println("Введите название курса ");
        String title = scanner.next();
        if (courseService.hasCourse(title)){
            System.out.println("Покупаем курс...");
            courseService.takeCourseByName(title);
            System.out.println("Купили курс " + title);
        } else {
            System.out.println("Не смогли купить курс...Такого курса нет...");
        }
    }

    @Override
    public void putCourse() {
        System.out.println("Введите название курса ");
        String title = scanner.next();

        System.out.println("Введите автора курса ");
        String author = scanner.next();

        Course course = new Course(title, author);
        courseService.putCourse(course);
    }

    @Override
    public void printCourse() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши курсы: ");
        courseService.printCourse();
    }
}
