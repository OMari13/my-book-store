package ru.itsjava.projectHW.servicesHW;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить курс ");
                clientService.buyCourse();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали положить курс");
                clientService.putCourse();
            } else if (menuNum == 3) {
                System.out.println("Печатаем название курсов");
                clientService.printCourse();
            } else {
                System.out.println("До встречи! ");
                break;
            }
        }
    }
    @Override
    public void printMenu() {
        System.out.println("1 - купить, 2 - отдать, все остальное выход");
    }
}
