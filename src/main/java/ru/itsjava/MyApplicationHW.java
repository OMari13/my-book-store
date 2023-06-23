package ru.itsjava;

import ru.itsjava.projectHW.servicesHW.StoreService;
import ru.itsjava.projectHW.servicesHW.StoreServiceImpl;

public class MyApplicationHW {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();
        storeService.start();
    }
}
