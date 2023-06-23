package ru.itsjava.projectHW.servicesHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.projectHW.domainHW.Course;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс CourseServiceImplTest должен")
class CourseServiceImplTest {
    List<Course> courseList = new ArrayList<>();

    @DisplayName("должен корректно выполнять метод takeCourseByName")
    @Test
    void shouldHaveCorrectMethodTakeCourseByName() {
        Course expectedCourse = new Course("Java_Basic", "Нежинский_Виталий");
        courseList.add(expectedCourse);

        CourseService courseService = new CourseServiceImpl(courseList);
        Assertions.assertEquals(expectedCourse, courseService.takeCourseByName("Java_Basic"));

    }

    @DisplayName("метод putCourse должен корректно проверить на наличие книги")
    @Test
    public boolean hasCourse() {
        Course expectedCourse = new Course("Java_Basic", "Нежинский_Виталий");
        courseList.add(expectedCourse);
        CourseService courseService = new CourseServiceImpl(courseList);
        Assertions.assertTrue(courseService.hasCourse("Java_Basic"));
        return false;

    }
}