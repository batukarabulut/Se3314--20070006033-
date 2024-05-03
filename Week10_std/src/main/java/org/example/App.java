package org.example;

/**
 * Hello world!
 *
 */


public class App
{
    public static void main(String[] args) {
        //Made all instances final
        final University my_university = new University();
        //Fixed stud1 name to student1
        final Student student1 = new Student("Jane Doe", "001");
        final Student student2 = new Student("John Smith", "002");
        final Course course1 = new Course("Software Engineering", 30);
        final Course course2 = new Course("Data Structures", 40);

        my_university.addCourse(course1);
        my_university.addCourse(course2);
        my_university.registerStudentForCourse(student1, course1);
        my_university.registerStudentForCourse(student2, course2);

        System.out.println("Total courses offered: " + Course.getTotalCourses());
        my_university.printEnrollments();
    }
}