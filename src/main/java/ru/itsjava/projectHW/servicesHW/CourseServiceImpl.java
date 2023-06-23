package ru.itsjava.projectHW.servicesHW;

import ru.itsjava.projectHW.domainHW.Course;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final List<Course> courseFromStore;
    @Override
    public Course takeCourseByName(String name) {
        Course resCourse = null;

        for (Course course : courseFromStore) {
            if (course.getTitle().equals(name)) {
                resCourse = course;
            }
        }

        if (resCourse != null) {
            courseFromStore.remove(resCourse);
            return resCourse;
        }

        return null;
    }

    @Override
    public void putCourse(Course course) {
        courseFromStore.add(course);
    }

    @Override
    public boolean hasCourse(String name) {
        for (Course course : courseFromStore) {
            if (course.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printCourse() {
        for (Course course: courseFromStore) {
            System.out.println(course.getTitle() + " " + course.getAuthor());
        }
    }
}
