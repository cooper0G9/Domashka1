package homework_9.StudentClasses;

import homework_9.StudentInterfaces.Course;
import homework_9.StudentInterfaces.Student;

import java.util.List;

public class StudentClass implements Student {

    private String name;
    private List<Course> courses;

    public StudentClass(String name, List<Course> courses){
        this.name = name;
        this.courses=courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}