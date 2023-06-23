package ru.itsjava.projectHW.servicesHW;

import ru.itsjava.projectHW.domainHW.Course;

public interface CourseService {
    Course takeCourseByName(String name);
    void putCourse(Course course);
    boolean hasCourse (String name);
    void printCourse();
}
