package ru.itsjava.projectBook.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<Book> books;

}
