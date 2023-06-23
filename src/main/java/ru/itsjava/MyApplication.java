package ru.itsjava;

import ru.itsjava.projectBook.services.StoreService;
import ru.itsjava.projectBook.services.StoreServiceImpl;

public class MyApplication {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();

        storeService.start();
    }
}
