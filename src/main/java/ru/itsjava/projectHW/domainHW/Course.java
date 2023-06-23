package ru.itsjava.projectHW.domainHW;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Course {
    private final String title;
    private final String author;

}
