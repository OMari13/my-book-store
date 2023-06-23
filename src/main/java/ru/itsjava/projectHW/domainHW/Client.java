package ru.itsjava.projectHW.domainHW;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Getter
@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<Course> courses;
}
