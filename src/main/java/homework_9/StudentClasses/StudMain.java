package homework_9.StudentClasses;

import homework_9.StudentInterfaces.Course;
import homework_9.StudentInterfaces.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudMain {

    public static void main(String[] args) {

        Course courseMath = new CourseClass("математика");
        Course coursePI = new CourseClass("ИТ");
        Course coursePhysics = new CourseClass("физика");
        Course courseChemistry = new CourseClass("химия");
        Course courseMusic = new CourseClass("музыка");
        Course courseNoName = new CourseClass("noName");

        Student student1 = new StudentClass("Иван", Arrays.asList(courseMath,coursePhysics,coursePI,courseChemistry));
        Student student2 = new StudentClass("Катя", Arrays.asList(courseMusic,coursePhysics,courseChemistry));
        Student student3 = new StudentClass("Вова", Arrays.asList(courseChemistry,courseMusic,coursePI));
        Student student4 = new StudentClass("Гена", Arrays.asList(courseMath,coursePhysics,coursePI));
        Student student5 = new StudentClass("Алла", Arrays.asList(courseMath,coursePhysics,courseMusic,courseChemistry));


        uniqueCourse(Stream.of(student1,student2,student3,student4,student5))  // п1. Уникальный курс
                .forEach(course -> System.out.println("уникальный курс " + course.courseName()));
        smartestStudent(Stream.of(student1,student2,student3,student4,student5))  //п2. самые любознательные
                .forEach(student -> System.out.println(student.getName()+" умник"));
        courseStudent(Stream.of(student1,student2,student3,student4,student5),courseMusic ) //п3. список студентов, посещающих курс
                .forEach(student -> System.out.println(student.getName() + " записаны на курс " + courseMusic.courseName()));



    }

    public static List<Student> courseStudent(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }



    public static List<Student> smartestStudent(Stream<Student> studentStream){

        Comparator<Student> studentComparator = Comparator.comparingInt(student -> student.getAllCourses().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }



    public static List<Course> uniqueCourse(Stream<Student> studentStream){
        return studentStream
                .map(Student::getAllCourses)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

}
