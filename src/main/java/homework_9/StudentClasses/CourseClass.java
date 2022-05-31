package homework_9.StudentClasses;

import homework_9.StudentInterfaces.Course;

public class CourseClass implements Course {

    private String courseName;

    public CourseClass(String courseName){
        this.courseName = courseName;
    }

    @Override
    public String courseName() {
        return courseName;
    }
}
